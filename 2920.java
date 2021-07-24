/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    boolean isItMixed = false, isItAscending = false, isItDecending = false;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int[] arr = new int[8];
	    for(int i =0;i<8;i++)
	        arr[i] = Integer.parseInt(st.nextToken());
        switch(arr[0]){
            case 1:
                for(int i=1;i<8;i++){
                    if(arr[i] == arr[i-1]+1){
                        if(i==7){
                            isItAscending = true;
                            break;
                        }
                        continue;
                    }
                    else{
                        isItAscending = false;
                        break;
                    }
                }
                break;
            case 8:
                for(int i=1;i<8;i++){
                    if(arr[i] == arr[i-1]-1){
                        if(i==7){
                            isItDecending = true;
                            break;
                        }
                        continue;
                    }
                    else{
                        isItDecending = false;
                        break;
                    }
                }
                break;
            default:
                isItMixed = true;
        }
        if(isItAscending)
            System.out.println("ascending");
        else if(isItDecending)
            System.out.println("descending");
        else
            System.out.println("mixed");
	}
}
