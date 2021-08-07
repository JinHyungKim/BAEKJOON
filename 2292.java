/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int result = 1;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    if(N==1){
	        System.out.println(result);
	        return;
	    }
	    
	    int num = 1;
	    int incNum = 6;
	    while(num<N){
	        result++;
	        num+=incNum;
	        incNum+=6;
	    }
	    
	    System.out.println(result);
	}
}
