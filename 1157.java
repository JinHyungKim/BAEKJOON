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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int max = -1;
		int maxIdx = 0;
		boolean isItCorrect = true;
	    int[] countingArr = new int[26];
	    String S = br.readLine();
	    int len = S.length();
	    S = S.toUpperCase();
	    
	    for(int i=0;i<len;i++)
	        countingArr[(int)S.charAt(i)-65]++;
	    
	    
        for(int i=0;i<26;i++){
            if(countingArr[i] == max)
                isItCorrect = false;
            
            else if(countingArr[i] == 0)
                continue;
            
            else if(countingArr[i]>max){
                max = countingArr[i];
                maxIdx = i;
                isItCorrect = true;
            }
        }
        if(isItCorrect)
            bw.write((char)(maxIdx+65));
        else
            bw.write('?');
		bw.flush();
		br.close();
		bw.close();
	}
}
