import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int ans = Integer.MAX_VALUE;
		int[][] DP = new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(i!=1) {
					if(j-i>=0)
						DP[i][j] = Math.min(DP[i][j-i]+arr[i-1], Math.min(DP[i-1][j-i]+arr[i-1], DP[i-1][j]));
					else
						DP[i][j] = DP[i-1][j];
				} 
				
				else
					DP[i][j] = DP[i][j-i]+arr[i-1]; 
			
				if(j==N) {
					ans = Math.min(ans, DP[i][j]);
				}
			}	
		}
//		for(int i=0;i<=N;i++)
//			System.out.println(Arrays.toString(DP[i]));
		System.out.println(ans);
	}
}