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
		String S = br.readLine();
		String resultString = S.replace("c=", "/");
		resultString = resultString.replace("c-", "/");
		resultString = resultString.replace("dz=", "/");
		resultString = resultString.replace("d-", "/");
		resultString = resultString.replace("lj", "/");
		resultString = resultString.replace("nj", "/");
		resultString = resultString.replace("s=", "/");
		resultString = resultString.replace("z=", "/");
		
		System.out.println(resultString.length());
	}
}
