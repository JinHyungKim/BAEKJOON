import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int[][] DP = new int[N][M];
		int ans = 0;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]==0)	//0이면 그냥 pass
					continue;
				
				
				if(i==0||j==0) {	//벽에 붙어있으면 그대로 복사
					DP[i][j] = arr[i][j];
				}else {				//일반적인 경우
					if(DP[i-1][j]!=0&&DP[i][j-1]!=0) {
						int min = Math.min(DP[i-1][j], DP[i][j-1]);
						if(arr[i-min][j-min]==1) {
							DP[i][j] = min+1;
						}else {
							DP[i][j] = DP[i-1][j-1]+1;
						}
					}else {
						DP[i][j] = 1;
					}
				}
				ans = Math.max(ans, DP[i][j]);
			}
		}
//		for(int i=0;i<N;i++)
//			System.out.println(Arrays.toString(DP[i]));
		System.out.println(ans*ans);
	}
}