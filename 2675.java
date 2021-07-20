/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		while(N-->0){
		    st = new StringTokenizer(br.readLine(), " ");
		    String[] sArr;
		    
		    int R = Integer.parseInt(st.nextToken());
		    String S = st.nextToken();
		    sArr = S.split("");
		    for(int i=0;i<sArr.length;i++){
		        for(int j=0;j<R;j++)
		            bw.write(sArr[i]);
		    }
		    bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
