import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int[] dx = new int[] {-1, 1, 0, 0};
	private static int[] dy = new int[] {0, 0, -1, 1};
	
	private static int[][] map;
	private static boolean[][] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 1;
		}
		int max = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!visited[i][j]&&map[i][j]==1) {
					max = Math.max(max, bfs(i, j, N, M));
				}
			}
		}
		System.out.println(max);
	}
	
	private static int bfs(int r, int c, int N, int M) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {r, c});
		int ret =0;
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			for(int i=0;i<4;i++) {
				int tempR = curr[0] + dx[i];
				int tempC = curr[1] + dy[i];
				if(tempR<0||tempC<0||tempR>=N||tempC>=M)
					continue;
				if(map[tempR][tempC]==1&&!visited[tempR][tempC]) {
					visited[tempR][tempC] = true;
					q.add(new int[] {tempR, tempC});
					ret++;
				}
			}
		}
		return ret;
	}
}
