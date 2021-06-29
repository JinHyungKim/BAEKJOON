/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		final int A = 300;
		final int B = 60;
		final int C = 10;
		
		int aClick=0;
		int bClick=0;
		int cClick=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		if(T%C!=0)
		    System.out.println(-1);
        else{
            aClick=T/A;
            T-=A*aClick;
            
            bClick=T/B;
            T-=B*bClick;
            
            cClick=T/C;
            T-=C*cClick;
            
            System.out.println(aClick+" "+bClick+" "+cClick);
        }
       
	}
}
