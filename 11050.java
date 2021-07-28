/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int fac(int a){
        if(a == 0)
            return 1;
        
        return a*fac(a-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println( fac(N) / ( fac(N-K) * fac(K) ) );
	}
}
