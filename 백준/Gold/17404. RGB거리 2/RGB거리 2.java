import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] DP = new int[N][3];
		int[][] table = new int[N][3];
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++)
				table[i][j] = Integer.parseInt(st.nextToken());
		}
		int ans = Integer.MAX_VALUE;
		for(int k=0;k<3;k++) {
			DP = new int[N][3];
			for(int i=0;i<N;i++)
				Arrays.fill(DP[i], Integer.MAX_VALUE);
			DP[0][k] = table[0][k];
			for(int i=1;i<N;i++) {
				for(int j=0;j<3;j++) {
					
					for(int j2=0;j2<3;j2++) {
						
						if(j==j2)
							continue;
						if(DP[i-1][j2]==Integer.MAX_VALUE)
							continue;
						DP[i][j] = Math.min(DP[i][j], table[i][j]+DP[i-1][j2]);
					
					}
				
				
				}
				
				if(i==N-1) {
					for(int j=0;j<3;j++) {
						if(j==k)
							continue;
						for(int j2=0;j2<3;j2++) {
							if(j==j2)
								continue;
							if(DP[i-1][j2]==Integer.MAX_VALUE)
								continue;
							DP[i][j] = Math.min(DP[i][j], table[i][j]+DP[i-1][j2]);
							ans = Math.min(ans, DP[i][j]);
						}
					}
				}
			}
//			for(int i=0;i<N;i++) {
//				System.out.println(Arrays.toString(DP[i]));
//			}
			
		}
		System.out.println(ans);
	}
}