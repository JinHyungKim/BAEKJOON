import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static final int HORIZONTAL = 1;;
	private static final int VERTICAL = 2;;
	private static final int DIAGONAL = 3;;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Main.Node> q = new ArrayList<Node>();
		int N = Integer.parseInt(br.readLine());
		int[][] DP = new int[N][N];
		int[][] map = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		int ans = 0;
		q.add(new Node(0, 1, HORIZONTAL));
		while(!q.isEmpty()) {
			Node curr = q.remove(q.size() - 1);
			if(curr.col==N-1&&curr.row==N-1)
				ans++;
			if(curr.statement==HORIZONTAL) {
				if(curr.col+1<N) {
					if(map[curr.row][curr.col+1]!=1) {
						DP[curr.row][curr.col+1] = DP[curr.row][curr.col];
						q.add(new Node(curr.row, curr.col+1, HORIZONTAL));
					}
				}
			}else if(curr.statement==VERTICAL) {
				if(curr.row+1<N) {
					if(map[curr.row+1][curr.col]!=1) {
						DP[curr.row+1][curr.col] = DP[curr.row][curr.col];
						q.add(new Node(curr.row+1, curr.col, VERTICAL));
					}
				}
			}else {
				if(curr.col+1<N) {
					if(map[curr.row][curr.col+1]!=1) {
						DP[curr.row][curr.col+1] = DP[curr.row][curr.col];
						q.add(new Node(curr.row, curr.col+1, HORIZONTAL));
					}
				}
				if(curr.row+1<N) {
					if(map[curr.row+1][curr.col]!=1) {
						DP[curr.row+1][curr.col] = DP[curr.row][curr.col];
						q.add(new Node(curr.row+1, curr.col, VERTICAL));
					}
				}
			}
			if(curr.row+1<N&&curr.col+1<N) {
				if(map[curr.row][curr.col+1]!=1&&map[curr.row+1][curr.col+1]!=1&&map[curr.row+1][curr.col]!=1) {
					DP[curr.row+1][curr.col+1] = DP[curr.row][curr.col];
					q.add(new Node(curr.row+1, curr.col+1, DIAGONAL));
				}
			}
		}
		System.out.println(ans);
		
	}
	private static class Node{
		public Node(int row, int col, int statement) {
			this.row = row;
			this.col = col;
			this.statement = statement;
		}
		int row, col;
		int statement;
	}
}
