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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		char[] a = new char[3];
		char[] b = new char[3];
	    int A_a;
	    int B_b;
	    int max;    
		for(int i=0;i<3;i++){
		    a[i] = A.charAt(2-i);
		    b[i] = B.charAt(2-i);
		}
		A_a = Integer.parseInt(String.valueOf(a));
		B_b = Integer.parseInt(String.valueOf(b));
		if(A_a>B_b)
		    max = A_a;
		else
		    max = B_b;
		System.out.println(max);
	
	}
}
