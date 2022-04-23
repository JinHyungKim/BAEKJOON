import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] DP;
	static Node[] arr;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		DP = new int[N];
		arr = new Node[N];
		StringTokenizer st;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			arr[i] = new Node(time, n);
			
			for(int j=0;j<n;j++) {
				arr[i].list[j] = Integer.parseInt(st.nextToken())-1;
			}	
		}
		int ans = 0;
		for(int i=0;i<N;i++) {
//			System.out.println("==============");
			
			if(DP[i]==0)
				DP[i] = calculate_time(i);
			ans = Math.max(ans, DP[i]);
//			System.out.println(Arrays.toString(DP));
		}
		System.out.println(ans);
//		for(int i=0;i<N;i++) {
//			System.out.println(arr[i]);
//		}
	}
	
	private static int calculate_time(int m) {
//		System.out.println(m);
		int max = 0;
		if(arr[m].list.length==0) {
			DP[m] = arr[m].time;
			return arr[m].time;
		}
		else {
			for(int i=0;i<arr[m].list.length;i++) {
				if(DP[arr[m].list[i]]==0) {
					max+=calculate_time(arr[m].list[i]);
				}else {
					max = Math.max(max, DP[arr[m].list[i]]);
				}
			}
		}
		return DP[m] = max+arr[m].time;
	}
	
	private static class Node{
		int time;
		int[] list;
		public Node(int time, int n) {
			this.time = time;
			this.list = new int[n];
		}
		@Override
		public String toString() {
			return "Node [time=" + time + ", list=" + Arrays.toString(list) + "]";
		}
	}
}
