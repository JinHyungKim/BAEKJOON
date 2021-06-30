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
	    long S = Long.parseLong(br.readLine());
	    long count = 0;
	    long num = 0;
	    
	    for(long i=1;i<S;i++){
	        if(num>S){
	            count--;
	            break;
	        }
	        else{
	            num += i;
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
