/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    double maxScore=-1;
	    double avg = 0;
	    double sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double[] arr = new double[N];
		for(int i=0;i<N;i++){
		    arr[i] = Double.parseDouble(st.nextToken());
		    if(arr[i]>maxScore)
		        maxScore = arr[i];
		}
		for(int i=0;i<N;i++){
		    arr[i] = arr[i]/maxScore * 100;
		    sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println(avg);
	}
}
