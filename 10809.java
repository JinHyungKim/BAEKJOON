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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String S = br.readLine();
		char[] cArr = S.toCharArray();
		
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		

		for(int i=0;i<S.length();i++){
		    if(arr[(int)S.charAt(i) - 97] == -1){
		        arr[(int)S.charAt(i) - 97] = i;
		    }
		}
		for(int i=0;i<25;i++)
		    System.out.print(arr[i]+" ");
		System.out.println(arr[25]);
	}
}
