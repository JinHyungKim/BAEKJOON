/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int largestNum=0, largestIdx=-1;
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i=0;i<9;i++){
		    arr[i] = Integer.parseInt(br.readLine());
		    if(arr[i]>largestNum){
		        largestNum = arr[i];
		        largestIdx = i;
		    }
		}
		System.out.println(largestNum);
		System.out.println(largestIdx+1);
	}
}
