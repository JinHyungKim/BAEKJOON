import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[10];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='9') {
				arr[6]++;
			}else {
				arr[str.charAt(i)-'0']++;
			}
		}
		int max = 0;
		for(int i=0;i<9;i++) {
			int cmp;
			if(i==6||i==9) {
				cmp = (int) Math.ceil(arr[i]/2.0);
			}else {
				cmp = arr[i];
			}
			max = Math.max(max, cmp);
		}
		System.out.println(max);
	}
}
