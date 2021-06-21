/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String inputString;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		inputString = br.readLine();
		StringTokenizer st = new StringTokenizer(inputString, "-");
		String[] parsingArray = new String[st.countTokens()];
		int[] parsingResultArray = new int[st.countTokens()];
		for(int i=0;st.hasMoreTokens();i++)
			parsingArray[i] = st.nextToken();
		for(int i=0;i<parsingArray.length;i++){
			int result = 0;
			StringTokenizer st2 = new StringTokenizer(parsingArray[i], "+");
			while(st2.hasMoreTokens())
				result += Integer.parseInt(st2.nextToken());
			parsingResultArray[i] = result;
		}
		int finalResult=parsingResultArray[0];
		for(int i=1;i<parsingResultArray.length;i++)
			finalResult-=parsingResultArray[i];
		
		System.out.println(finalResult);
	}
}
