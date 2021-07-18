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
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(N-->0){
		    int totalScore = 0;
		    int score = 1;
            st = new StringTokenizer(br.readLine(), "O", true);
            while(st.hasMoreTokens()){
                String tk = st.nextToken();
                if(tk.equals("O"))
                    totalScore += score++;
                else
                    score = 1;
            }
            System.out.println(totalScore);
		}
	}
}
