import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] DP = new int[N];
		Arrays.fill(DP, Integer.MAX_VALUE);
		DP[0] = 0;
		for(int i=0;i<N;i++) {
			if(DP[i]==Integer.MAX_VALUE)
				break;
			for(int j=1;j<=arr[i];j++) {
				if(i+j<N)
					DP[i+j] = Math.min(DP[i+j], DP[i]+1);
			}
		}
		if(DP[N-1]==Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(DP[N-1]);
	}
}
