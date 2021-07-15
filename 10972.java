/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine(), 10);
		System.out.println(factorial(N));
	}
}
