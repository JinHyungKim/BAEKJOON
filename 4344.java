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
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(N-->0){
		    int sum = 0;
		    double avg = 0;
		    double ratioOfTop=0;
		    st = new StringTokenizer(br.readLine(), " ");
		    int C = Integer.parseInt(st.nextToken());
		    int[] arr = new int[C];
		    for(int i=0;i<C;i++){
		        arr[i] = Integer.parseInt(st.nextToken());
		        sum += arr[i];
		    }
		   // System.out.println(sum);
	        avg = sum/arr.length;
	       // System.out.println(avg);
	        for(int i=0;i<C;i++){
	            if(arr[i]>avg)
	                ratioOfTop += 1;
	        }
	        
	        ratioOfTop = ratioOfTop/arr.length*100;
	        System.out.println(String.format("%.3f", ratioOfTop)+"%");
		}
	}
}
