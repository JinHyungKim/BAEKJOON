import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int test_case = 1;test_case<=T;test_case++) {
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int[][] DP = new int[N][N];
			int[][] sum = new int[N][N];
			for(int i=0;i<N;i++) {
				Arrays.fill(DP[i], Integer.MAX_VALUE);
				DP[i][i] = 0;
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=0;i<N;i++) {
				for(int j=i;j<N;j++) {
					int sum1 = 0;
					for(int k=i;k<=j;k++) {
						sum1+=arr[k];
					}
					sum[i][j] = sum1;
				}
			}
			
			for(int k=0;k<N-1;k++) {
				for(int j=k+1, i=0;j<N;j++, i++) {
					for(int l=i;l<j;l++) {
						DP[i][j] = Math.min(DP[i][j], sum[i][j]+DP[i][l]+DP[l+1][j]);
					}
				}
			}
			
//			for(int i=0;i<N;i++) {
//				System.out.println(Arrays.toString(sum[i]));
//			}
//			for(int i=0;i<N;i++) {
//				System.out.println(Arrays.toString(DP[i]));
//			}
			sb.append(DP[0][N-1]+"\n");
		}
		System.out.println(sb.toString());
	}
}
