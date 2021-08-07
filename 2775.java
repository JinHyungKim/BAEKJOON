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
	    int T = Integer.parseInt(br.readLine());
	    int N,K;
	    int[][] apt;
	    while(T-->0){
	        K = Integer.parseInt(br.readLine());
	        N = Integer.parseInt(br.readLine());
	        apt = new int[K+1][N];
	        for(int i = 0;i<=K;i++){
	            apt[i][0] = 1;
	            for(int j = 1;j<N;j++){
	                if(i==0)
	                    apt[i][j] = j+1;    
	                else
	                    apt[i][j] = apt[i-1][j] + apt[i][j-1];
	            }
	        }
	        System.out.println(apt[K][N-1]);
	        //for(int i=0;i<K+1;i++)
	          //  System.out.println(Arrays.toString(apt[i]));
            //System.out.println("===========");	            
	    }
	}
}
