/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		int result=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[] withdrawTime = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			withdrawTime[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(withdrawTime);
		for(int i=0;i<N;i++){
			withdrawTime[i] *= (N-i);
			result += withdrawTime[i];
		}
		System.out.println(result);
	}
}
