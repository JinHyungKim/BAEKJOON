/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int lowerBound(int[] arr, int val){
        int low = 0;
        int high = arr.length;
        while(low<high){
            final int mid = low + (high-low)/2;
            if(val <= arr[mid])
                high = mid;
            else
                low = mid+1;
        }
        return low;
    }
    
    public static int upperBound(int[] array, int value) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            final int mid = low + (high - low)/2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    static int solved(int[] arr, int val){
        return upperBound(arr, val) - lowerBound(arr, val);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] srcArr = new int[N];
		
		for(int i=0;i<N;i++)
		    srcArr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] destArr = new int[M];
		for(int i=0;i<M;i++)
		    destArr[i] = Integer.parseInt(st.nextToken());
		Integer temp[] = Arrays.stream(srcArr).boxed().toArray(Integer[]::new);
		
		ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(temp));
		Collections.sort(lst);
		temp = lst.toArray(new Integer[lst.size()]);
		//Arrays.sort(srcArr);
		srcArr = Arrays.stream(temp).mapToInt(i->i).toArray();
		
		for(int i=0;i<destArr.length;i++){
		    sb.append(solved(srcArr, destArr[i]));
		    sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
