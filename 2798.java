/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int cmp(int M, int a, int b){
        int aResult = 0;
        int bResult = 0;
        
        aResult = M-a;
        bResult = M-b;
        if(aResult>=0 && aResult<bResult)
            return a;
        else if(bResult>=0 && aResult>=bResult)
            return b;
        else
            return -1;
    }
    
    static int solved(int[] arr, int cnt, int M, int pos, int val){
        if(cnt == 3)
            return val;
        if(pos == arr.length)
            return -1;
        int ret = 0;
        ret = cmp(M, ret, solved(arr, cnt+1, M, pos+1, val+arr[pos]));
        //System.out.println("ret:"+ret+"//"+"cnt:"+cnt+"//"+"pos:"+pos+"//"+"val:"+val);
        ret = cmp(M, ret, solved(arr, cnt, M, pos+1, val));
        //System.out.println("ret:"+ret+"//"+"cnt:"+cnt+"//"+"pos:"+pos+"//"+"val:"+val);
        //System.out.println("========");
        return ret;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
	    int[] cardSet = new int[N];
	    st = new StringTokenizer(br.readLine(), " ");
	    for(int i=0;i<N;i++)
	        cardSet[i] = Integer.parseInt(st.nextToken());
	    int result = solved(cardSet, 0, M, 0, 0);
	    System.out.println(result);
	}
}
