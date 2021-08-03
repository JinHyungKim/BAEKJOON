import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String []args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Integer[] arr = new Integer[S.length()];
        for(int i=0;i<S.length();i++){
            arr[i] = Character.getNumericValue(S.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i:arr)
            System.out.print(i);
    }
}
