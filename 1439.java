/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    final char ZERO = '0';
	    final char ONE = '1';
	    int count = 0;
	    int zeroCount = 0;
	    int oneCount = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char[] arr = br.readLine().toCharArray();
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i] == ZERO){
	            while(i+1<arr.length&&arr[i+1]==ZERO){
	                i++;
	            }
	            zeroCount++;
	        }
	        else if(arr[i] == ONE){
	            while(i+1<arr.length&&arr[i+1]==ONE){
	                i++;
	            }
	            oneCount++;
	        }
	    }
	    if(oneCount<zeroCount)
	        System.out.println(oneCount);
	    else
	        System.out.println(zeroCount);
	}
}
