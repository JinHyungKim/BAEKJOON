import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static final int MOD = 1000000009;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		long[][] DP = new long[4][1000001];
		DP[1][1] = 1;
		DP[2][1] = 0;
		DP[3][1] = 0;
		DP[1][2] = 0;
		DP[2][2] = 1;
		DP[3][2] = 0;
		DP[1][3] = 1;
		DP[2][3] = 1;
		DP[3][3] = 1;
		for(int i=4;i<=100000;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					if(k==j)
						continue;
					DP[j][i] += (DP[k][i-j])%MOD;
					DP[j][i] %= MOD;
				}
			}
		}
		for(int test_case=0;test_case<T;test_case++) {
			int N = Integer.parseInt(br.readLine());
			
			long sum =0;
			for(int i=1;i<=3;i++) {
				sum+=DP[i][N]%MOD;
				sum%=MOD;
			}
			sb.append(sum+"\n");
//			for(int j=1;j<=3;j++) {
//				for(int i=1;i<=N;i++)
//					System.out.print(DP[j][i]+" ");
//				System.out.println();
//			}
//			System.out.println();
		}
		System.out.println(sb);
	}
}
