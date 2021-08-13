/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		Stack<String> stk = new Stack<>();
		boolean isItSymetric = true;

 		while(true){
			str = br.readLine();
			if(str.equals("."))
				break;
			st = new StringTokenizer(str, "[]()", true);
			while(st.hasMoreTokens()){
				String nxtToken = st.nextToken();
				switch(nxtToken){
					case "(":
						stk.push("(");
						break;
					case ")":
						if(!stk.empty()){
							if(stk.peek().equals("("))
								stk.pop();
							else{
								isItSymetric = false;
								break;
							}
						}
						else{
							isItSymetric = false;
							break;
						}
						break;
					case "[":
						stk.push("[");
						break;
					case "]":
						if(!stk.empty()){
							if(stk.peek().equals("["))
								stk.pop();
							else{
								isItSymetric = false;
								break;
							}
						}
						else{
							isItSymetric = false;
							break;
						}
						break;
					default:
						break;
				}
			}
			if(isItSymetric && stk.empty())
				System.out.println("yes");
			else
				System.out.println("no");
			isItSymetric = true;
			while(!stk.empty())
				stk.pop();
		}
	}
}
