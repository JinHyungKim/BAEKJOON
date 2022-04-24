import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		for(int i=0;i<N;i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		double[] DP = new double[N];
		DP[0] = arr[0];
		double max = DP[0];
		for(int i=1;i<N;i++) {
			if(arr[i]>DP[i-1]*arr[i]) 
				DP[i] = arr[i];
			else {
				DP[i] = DP[i-1]*arr[i];
			}
			max = Math.max(max, DP[i]);
		}
		System.out.println(String.format("%.3f", max));
	}
}
