import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " <>", true);
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			StringBuffer ss = new StringBuffer();
			String curr = st.nextToken();
			if(curr.equals("<")) {
				sb.append("<");
				while(true) {
					String t = st.nextToken();
					if(t.equals(">")) {
						sb.append(">");
						break;
					}
					sb.append(t);
				}
			}else {
				ss.append(curr);
				sb.append(ss.reverse().toString()+"");
			}
		}
		System.out.println(sb);
	}
}
