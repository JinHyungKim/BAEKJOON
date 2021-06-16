/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<N;i++){
			String str = sc.nextLine();
			Stack stack = new Stack();
			int popCheck=0;
			int pushCheck=0;
			for(int j = 0;j<str.length();j++){
				if(str.charAt(j)=='('){
					stack.add(str.charAt(j));
					pushCheck++;
				}
				
				else if(str.charAt(j)==')'){
					popCheck++;
					if(stack.empty())
						break;
					stack.pop();
				}
			}
			if(stack.empty()&&popCheck == pushCheck)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
