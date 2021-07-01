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
	    int temp;
	    PriorityQueue<Integer> q = new PriorityQueue<>();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    for(int i=0;i<N;i++)
	        q.add(Integer.parseInt(br.readLine()));
	    
	    while(q.size()!=1){
	        count += q.peek();
	        temp = q.poll();
	        count += q.peek();
	        q.add(temp+q.poll());
	    }
	    System.out.println(count);
	   // for(int i=0;i<N;i++)
	   //     System.out.println(q.poll());
	    
	    
	}
}
