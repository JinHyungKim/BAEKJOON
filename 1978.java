/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int count = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    while(N-->0){
	        int n = Integer.parseInt(st.nextToken());
	        if(n==2)
	            count++;
	        else{
	            for(int i=2;i<n;i++){
	                if(n%i==0)
	                    break;
	                if(i==n-1)
	                    count++;
	            }
	        }
	    }
	    System.out.println(count);
	}
}
