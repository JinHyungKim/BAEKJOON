/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int sum = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int[] arr = new int[5];
	    for(int i=0;i<5;i++){
	        arr[i] = Integer.parseInt(st.nextToken());
	        sum += Math.pow(arr[i], 2);
	    }
	    System.out.println(sum%10);
	}
}
