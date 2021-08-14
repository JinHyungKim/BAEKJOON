/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int retArithmeticMean(int[] arr){
        float val;
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        val = sum/(float)arr.length;
        return Math.round(val);
    }
    
    static int retMedianValue(int[] arr){
        return arr[arr.length/2];
    }
    
    static int retMode(int[] arr){
        int first = -1;
        int returnVal = -1818;
        int cnt = 0;
        int cntArr[] = new int[8001];
        for(int i = 0;i<arr.length;i++){
            cntArr[arr[i]+4000]++;
        }
        for(int i=0;i<cntArr.length;i++){
            if(cntArr[i]==0)
                continue;
            else{
                if(cntArr[i]>first)
                    first = cntArr[i];
            }
        }
        
        for(int i=0;i<cntArr.length;i++){
            if(cntArr[i] == first){
                returnVal = i-4000;
                cnt++;
            }
            if(cnt == 2)
                break;
        }
        return returnVal;
    }
    
    static int retRange(int[] arr){
        return arr[arr.length-1] - arr[0];
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int arithmeticMean;
		int medianValue;
		int mode;
		int range;
		int[] array = new int[N];
		
		for(int i=0;i<N;i++)
		    array[i] = Integer.parseInt(br.readLine());
	    
	    Arrays.sort(array);
	    arithmeticMean = retArithmeticMean(array);
	    medianValue = retMedianValue(array);
	    mode = retMode(array);
	    range = retRange(array);
	    
	    System.out.println(arithmeticMean);
	    System.out.println(medianValue);
	    System.out.println(mode);
	    System.out.println(range);
	}
}
