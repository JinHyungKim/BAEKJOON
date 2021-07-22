/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int time = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		for(int i=0;i<S.length();i++){
		    switch (S.charAt(i)){
		        case 'A':
		        case 'B':
		        case 'C':
		            time += 3;
		            break;
		        case 'D':
		        case 'E':
		        case 'F':
		            time += 4;
		            break;
		        case 'G':
		        case 'H':
		        case 'I':
		            time += 5;
		            break;
		        case 'J':
		        case 'K':
		        case 'L':
		            time += 6;
		            break;
		        case 'M':
		        case 'N':
		        case 'O':
		            time += 7;
		            break;
		        case 'P':
		        case 'Q':
		        case 'R':
		        case 'S':
		            time += 8;
		            break;
		        case 'T':
		        case 'U':
		        case 'V':
		            time += 9;
		            break;
		        case 'W':
		        case 'X':
		        case 'Y':
		        case 'Z':
		            time += 10;
		            break;
		    }
		}
		System.out.println(time);
	}
}
