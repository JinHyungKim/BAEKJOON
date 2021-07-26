/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BigInteger R = new BigInteger("31");
	    BigInteger M = new BigInteger("1234567891");
	    BigInteger sum = new BigInteger("0");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String S = br.readLine();
		for(int i=0;i<L;i++){
		    BigInteger a = new BigInteger(String.valueOf(((int)S.charAt(i)-96)));
		    BigInteger r = new BigInteger("1");
		    for(int j=0;j<i;j++)
		        r = r.multiply(R);
		   // System.out.println(r);
		    a = a.multiply(r);
		    sum  = sum.add(a);
		}
	//	System.out.println(sum);
	    System.out.println(sum.remainder(M));
	}
}
