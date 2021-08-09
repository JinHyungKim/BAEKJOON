/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int solved(char[][] arrS, int sr, int sc){

        int result=0;
        char[][] arr = new char[8][8];

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                arr[i][j] = arrS[i+sr][j+sc];
        }
        
        // for(int i=0;i<8;i++)
        //     System.out.println(Arrays.toString(arr[i]));
        // System.out.println("====================================================================");
        
        for(int i=0;i<8;i++){
            if(i==0){
                for(int j=1;j<8;j++){
                    if(arr[i][j] == arr[i][j-1]){
                        result++;
                        if(arr[i][j]=='W')
                            arr[i][j]='B';
                        else
                            arr[i][j]='W';
                        }
                    }
                }
            else{
                for(int j=0;j<8;j++){
                    if(j==0){
                        if(arr[i][j] == arr[i-1][j]){
                            result++;
                            if(arr[i][j]=='W')
                                arr[i][j]='B';
                            else
                                arr[i][j]='W';
                        }
                    }
                    else{
                        if(arr[i][j] == arr[i][j-1]){
                            result++;
                            if(arr[i][j]=='W')
                                arr[i][j]='B';
                            else
                                arr[i][j]='W';
                        }
                    }
                }
            }
        }   
        // for(int i=0;i<8;i++)
        //     System.out.println(Arrays.toString(arr[i]));
        //System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");    
        return result;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
	    int cnt = 0;
	    int caseWhenStartIsWhite = 0;
	    int caseWhenStartIsBlack = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int N = Integer.parseInt(st.nextToken()); //N:행
	    int M = Integer.parseInt(st.nextToken()); //M:열
	    char[][] chess = new char[N][M];

	    int[] resultArr = new int[(N-7)*(M-7)*2];

	    for(int i=0;i<N;i++)
	        chess[i] = (br.readLine()).toCharArray();

        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
                resultArr[cnt] = solved(chess, i,j);
                cnt++;
                if(chess[i][j]=='W'){
                    chess[i][j]='B';
                    resultArr[cnt] = solved(chess, i,j)+1;
                    chess[i][j]='W';
                }
                else{
                    chess[i][j]='W';
                    resultArr[cnt] = solved(chess, i,j)+1;
                    chess[i][j]='B';
                }
                cnt++;
            }
        }

        //System.out.println(Arrays.toString(resultArr));
        Arrays.sort(resultArr);
        System.out.println(resultArr[0]);

	}
}
