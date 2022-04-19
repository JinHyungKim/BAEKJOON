import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		boolean[] isVIP = new boolean[N+1];
		int[] DP = new int[N+1];
		for(int i=1;i<=M;i++) {
			isVIP[Integer.parseInt(br.readLine())] = true;
		}
		int[] res = new int[M+1];
		Arrays.fill(res, 1);
		int rescnt = 0;
		DP[0] = 1;
		DP[1] = 1;
		for(int i=2;i<=N;i++) {
			if(isVIP[i]) {
				res[rescnt++] = DP[i-1];
				DP[i] = 1;
			}else if(isVIP[i-1]) {
				DP[i] = 1;
			}else if(i==N) {
				DP[i] = DP[i-1]+DP[i-2];
				res[rescnt] = DP[i];
			}else
				DP[i] = DP[i-1]+DP[i-2];
		}
		int sum = 1;
		for(int i=0;i<M+1;i++)
			sum *= res[i];
		System.out.println(sum);
	}
}
