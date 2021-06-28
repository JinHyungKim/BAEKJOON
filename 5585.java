import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int FH = 0;
	    int H = 0;
	    int FT = 0;
	    int T = 0;
	    int F = 0;
	    int O = 0;
	    
	    int count = 0;
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = 1000 - Integer.parseInt(br.readLine());
	    FH = N/500;
	    H = (N-FH*500)/100;
	    FT = (N-FH*500-H*100)/50;
	    T = (N-FH*500-H*100-FT*50)/10;
	    F = (N-FH*500-H*100-FT*50-T*10)/5;
	    O = (N-FH*500-H*100-FT*50-T*10-F*5);
	    System.out.println(FH+H+FT+T+F+O);
	}
}
