/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int result = 0;
	    int temp = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int A = Integer.parseInt(st.nextToken());
	    int B = Integer.parseInt(st.nextToken());
	    int V = Integer.parseInt(st.nextToken());
	    if(A<V){
    	    V-=A;
    	    result++;
    	    
    	    if(V%(A-B)==0){
    	        result += V/(A-B);
    	        if(result == 1)
    	            result++;  
    	    }
    	    else{
    	        result += V/(A-B);
    	        result++;
    	    }
	    }
	    else
	        result = 1;
	    System.out.println(result);
	}
}
