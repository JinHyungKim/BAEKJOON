/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    final int N = 10;
	    final int DENORMINATOR = 42;
	    int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[N];
		boolean[] countingArr = new boolean[DENORMINATOR];
		for(int i=0;i<N;i++){
	        arr[i] = (Integer.parseInt(br.readLine()))%DENORMINATOR;
	        if(!countingArr[arr[i]])
	            countingArr[arr[i]] = true;
		}
	//	System.out.println(Arrays.toString(countingArr));
		for(int i=0;i<DENORMINATOR;i++)
		    if(countingArr[i])
		        result++;
		System.out.println(result);
	}
}
