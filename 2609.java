/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int getGCD(int a, int b){
        int i=1;
        int result = -1;
        for(;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0)
                result = i;
        }
        return result;
    }
    static int getLCM(int a, int b){
        int i=a*b;
        int result = i;
        for(;i>=Math.max(a, b);i--){
            if(i%a==0 & i%b==0)
                result = i;
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		System.out.println(getGCD(num1, num2));
		System.out.println(getLCM(num1, num2));
	}
}
