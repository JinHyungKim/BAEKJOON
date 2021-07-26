/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static boolean checkIsItPalindrome(String S){
        int startIdx = 0;
        int endIdx = S.length()-1;
        while(startIdx<endIdx){
            if(S.charAt(startIdx) != S.charAt(endIdx))
                return false;
            else{
                startIdx++;
                endIdx--;
            }
        }
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    boolean isItPalindrome = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		    String S = br.readLine();
		    
		    if(Integer.parseInt(S)==0)  // escape condition
		        break;
		    else{
		        isItPalindrome = checkIsItPalindrome(S);
		    }
		    if(isItPalindrome)
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}
