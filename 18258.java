/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String cmd;
		int value=0;
		int lastPush=0;
		int i=0;
		
		Queue<Integer> que = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(i<N){
			cmd = br.readLine();
			if(cmd.contains("push")){
				value = Integer.parseInt(cmd.substring(5));
				lastPush = value;
				cmd = "push";
			}
			switch(cmd){
			    case "push":
		            que.offer(value);
		            break;
			    case "pop":
			        if(que.peek()==null)
			            bw.write("-1\n");
			        else
			            bw.write(que.poll()+"\n");
			        break;
			    case "size":
			        bw.write(que.size()+"\n");
			        break;
			    case "empty":
			        if(que.peek()==null)
			            bw.write("1\n");
			        else
			            bw.write("0\n");
			        break;
			    case "front":
			        if(que.peek()==null)
			            bw.write("-1\n");
			        else
			            bw.write(que.peek()+"\n");
			        break;
			    case "back":
			        if(que.size()==0)
			            bw.write("-1\n");
			        else
			            bw.write(lastPush+"\n");
			        break;
			}
			i++;
		}
		bw.flush();
		bw.close();
	}
}
