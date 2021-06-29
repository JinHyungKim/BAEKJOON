/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int testCase;
	    int count;
	    int DocumentScreeningResults;
	    int leastInterviewReasult;
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    testCase = Integer.parseInt(br.readLine());
	    
	    for(int i=0;i<testCase;i++){
	        count = 1;
	        int applicantNumber = Integer.parseInt(br.readLine());
	        int[][] array = new int[applicantNumber][2];
            for(int j=0;j<applicantNumber;j++){
                st = new StringTokenizer(br.readLine(), " ");
                array[j][0] = Integer.parseInt(st.nextToken());
                array[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array, new Comparator<int[]>(){
                @Override
                public int compare(int[] t1, int[] t2){
                    return t1[0] - t2[0];
                }
            });
            leastInterviewReasult = array[0][1];
            for(int j=1;j<applicantNumber;j++){
                if(array[j][1]<leastInterviewReasult){
                    count++;
                    leastInterviewReasult = array[j][1];
                }
            }
            System.out.println(count);
	    }
	}
}
