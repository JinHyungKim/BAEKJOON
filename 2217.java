import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int maxWeight, totalMaxWeight;
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    Integer[] ropeArray = new Integer[N];
	    for(int i=0;i<N;i++)
	        ropeArray[i] = Integer.parseInt(br.readLine());
	    
	    Arrays.sort(ropeArray, Collections.reverseOrder());
	    
	    maxWeight = ropeArray[0];
	    totalMaxWeight = maxWeight;
	    
	    for(int i=1;i<N;i++){
	        maxWeight = ropeArray[i];
	        if(totalMaxWeight < maxWeight*(i+1))
	            totalMaxWeight = maxWeight*(i+1);
	    }
	    System.out.println(totalMaxWeight);
	}
}
