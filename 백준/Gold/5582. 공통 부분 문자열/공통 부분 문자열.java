import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int[][] DP = new int[str2.length()+1][str1.length()+1];
		int max = 0;
		for(int i=1;i<=str2.length();i++) {
			for(int j=1;j<=str1.length();j++) {
				if(str1.charAt(j-1)==str2.charAt(i-1)) {
					DP[i][j] = DP[i-1][j-1]+1;
					max = Math.max(max, DP[i][j]);
				}
			}
		}
		System.out.println(max);
	}
}
