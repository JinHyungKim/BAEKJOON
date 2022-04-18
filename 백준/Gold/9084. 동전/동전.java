import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int test_case = 0;test_case<T;test_case++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[N+1];
			for(int i=1;i<=N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int K = Integer.parseInt(br.readLine());
			int[] DP = new int[K+1];
			DP[0] = 1;
			
			for(int i=1;i<=N;i++) {
				for(int j=arr[i];j<=K;j++) {
					DP[j] += DP[j-arr[i]];
				}
			}
			//.out.println(Arrays.toString(DP));
			sb.append(DP[K]+"\n");
		}
		System.out.println(sb);
	}
}