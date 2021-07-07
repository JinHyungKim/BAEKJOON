/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int aaaaNum;
	    int bbNum;
	    int num_of_Tokens;
	    StringBuilder myString = new StringBuilder();
	    String buff = new String();
	    boolean isItPossible = true;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    
	    st = new StringTokenizer(br.readLine(), ".", true);
	    num_of_Tokens = st.countTokens();
	    
	    while(st.hasMoreTokens()){
	        buff = st.nextToken();
	        if(buff.equals("."))
	            myString.append(".");
	        else if(buff.length()%2 != 0){
	            isItPossible = false;
	            break;
	        }
	        else{
	            aaaaNum = buff.length()/4;
	            bbNum = (buff.length()%4)/2;
	            while(aaaaNum-->0)
	                myString.append("AAAA");
	            while(bbNum-->0)
	                myString.append("BB");
	        }
	       // if(num_of_Tokens>1 && st.hasMoreTokens()==true)
	       //     myString.append(".");
	    }
	    
	    if(isItPossible)
	        System.out.println(myString.toString());
	    else
	        System.out.println(-1);
	}
}
