import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] arr2 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		 
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
		}
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int temp = 0;
		Arrays.sort(arr2);
		for(int i=0;i<N;i++) {
			if(m.containsKey(arr2[i]))
				continue;
			m.put(arr2[i], temp++);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(m.get(arr[i])+" ");
		}
		System.out.println(sb);
	}
}
