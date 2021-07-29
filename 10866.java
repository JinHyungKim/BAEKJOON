/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Deque<Integer> q = new LinkedList<>();
	    String S;
	    int val;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    int N = Integer.parseInt(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    while(N-->0){
	        st = new StringTokenizer(br.readLine(), " ");
	        S = st.nextToken();
	        switch(S){
	            case "push_front":
	                val = Integer.parseInt(st.nextToken());
	                q.addFirst(val);
	                break;
	            case "push_back":
	                val = Integer.parseInt(st.nextToken());
	                q.addLast(val);
	                break;         
	            case "pop_front":
	                if(q.size() == 0)
	                    sb.append(-1);
	                else
	                    sb.append(q.pollFirst());
	                sb.append(System.getProperty("line.separator"));
	                break;
	            case "pop_back":
	                if(q.size() == 0)
	                    sb.append(-1);
	                else
	                    sb.append(q.pollLast());
	                sb.append(System.getProperty("line.separator"));
	                break;
	            case "size":
	                sb.append(q.size());
	                sb.append(System.getProperty("line.separator"));
	                break;
	            case "empty":
	                if(q.size() == 0)
	                    sb.append(1);
	                else
	                    sb.append(0);
	                sb.append(System.getProperty("line.separator"));
	                break;
	            case "front":
	                if(q.size() == 0)
	                    sb.append(-1);
	                else
	                    sb.append(q.peekFirst());
	                sb.append(System.getProperty("line.separator"));
	                break;
	            case "back":
	                if(q.size() == 0)
	                    sb.append(-1);
	                else
	                    sb.append(q.peekLast());
	                sb.append(System.getProperty("line.separator"));  
	                break;
	        }
	    }
	    System.out.println(sb.toString());
	}
}
