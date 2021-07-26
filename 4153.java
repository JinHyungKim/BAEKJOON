/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int tmep=0;
	    boolean isItRT = false;
	    int A,B,C;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String S;
		int[] arr = new int[3];
		while(true){
		    isItRT = false;
		    st = new StringTokenizer(br.readLine(), " ");
		    for(int i=0;i<3;i++)
		        arr[i] = Integer.parseInt(st.nextToken());
		    int i=0;
		    Arrays.sort(arr);
		    //System.out.println(Arrays.toString(arr));
		    if(arr[0]==0)
		        break;
		    else
		        if(arr[i+2]*arr[i+2] == arr[i+1]*arr[i+1]+arr[i]*arr[i])
		            isItRT = true;
		    if(isItRT)
		        System.out.println("right");
		    else
		        System.out.println("wrong");
		}
	}
}
