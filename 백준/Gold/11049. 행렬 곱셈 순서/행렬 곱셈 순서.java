import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] d = new int[N+1];
		st = new StringTokenizer(br.readLine());
		d[0] = Integer.parseInt(st.nextToken());
		d[1] = Integer.parseInt(st.nextToken());
		for(int i=2;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			d[i] = Integer.parseInt(st.nextToken());
		}
		//System.out.println(Arrays.toString(d));
		int[][] DP = new int[N][N];
		for(int i=0;i<N;i++)
			Arrays.fill(DP[i], Integer.MAX_VALUE);
		for(int i=0;i<N;i++) {
			DP[i][i] = 0;
		}
		for(int i=0, j=1;j<N;i++, j++) {
			DP[i][j] = d[i]*d[j]*d[j+1];
		}
//		for(int i=0;i<N;i++)
//			System.out.println(Arrays.toString(DP[i]));
		int k=2;
		while(true) {
			int i=0;
			for(int j=k;j<N;j++) {
				for(int l=i;l<j;l++) {
					DP[i][j] = Math.min((DP[i][l]+DP[l+1][j]+(d[i]*d[l+1]*d[j+1])), DP[i][j]);
				}
				//System.out.println(i+" "+j);
				i++;
			}
			
			
			if(i==1&&k==N-1)
				break;
			k++;
		}
//		for(int i=0;i<N;i++)
//		System.out.println(Arrays.toString(DP[i]));
		System.out.println(DP[0][N-1]);
	}
}
