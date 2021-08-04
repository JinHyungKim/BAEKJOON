/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static boolean binSearch(int[] arr, int val, int srt, int end){
        if(srt > end)
            return false;
        int mid = (srt + end)/2;
        
        if(arr[mid]<val)
            return binSearch(arr, val, mid+1, end);
        else if(arr[mid]>val)
            return binSearch(arr, val, srt, mid-1);
        else if(arr[mid]==val)
            return true;
        else
            return false;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] srcArr1 = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
	    for(int i=0;i<N;i++)
	        srcArr1[i] = Integer.parseInt(st.nextToken());
	    Arrays.sort(srcArr1);
	    
	    int M = Integer.parseInt(br.readLine());
	    st = new StringTokenizer(br.readLine(), " ");
	    for(int i=0;i<M;i++){
	        if(binSearch(srcArr1, Integer.parseInt(st.nextToken()), 0, srcArr1.length-1))
	            System.out.println(1);
	        else
	            System.out.println(0);
	    }
	}
}
