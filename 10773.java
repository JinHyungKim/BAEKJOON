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
	    int K = Integer.parseInt(br.readLine());
	    Stack<Integer> stk = new Stack<>();
	    while(K-->0){
	        int insertNum = Integer.parseInt(br.readLine());
	        if(insertNum != 0){
	            stk.push(insertNum);
	        }
	        else{
	            if(!stk.empty());
	                stk.pop();
	        }
	    }
	    int sum = 0;
	    while(!stk.empty()){
	        sum += stk.pop();
	    }
	    System.out.println(sum);
	}
}
