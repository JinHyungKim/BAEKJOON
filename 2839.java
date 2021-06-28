import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Maim
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    final int THREE_KG = 3;
	    final int FIVE_KG = 5;
	    
	    int numberOfThreeKgBag=0;
	    int numberOfFiveKgBag=0;
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    int temp;
	    
	    numberOfFiveKgBag=N/FIVE_KG;
	    for(int i=1;;i++){
	        
	        temp=N-numberOfFiveKgBag*FIVE_KG;
	        if(temp%THREE_KG==0){
	            numberOfThreeKgBag=temp/THREE_KG;
	            System.out.println(numberOfThreeKgBag+numberOfFiveKgBag);
	            break;
	        }
	        else{
	            numberOfFiveKgBag--;
	            if(numberOfFiveKgBag<0){
	                System.out.println(-1);
	                break;
	            }
	        }
	    }
	}
}
