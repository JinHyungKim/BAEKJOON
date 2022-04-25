import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] DP = new int[N+1][2];
		DP[0][0] = 1;
		DP[0][1] = 0;
		
		for(int i=1;i<=N;i++) {
			DP[i][0] = DP[i-1][1];
			DP[i][1] = DP[i-1][0]+DP[i-1][1];
		}
		System.out.println(DP[N][0]+" "+DP[N][1]);
	}
}
