/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x,y,w,h;
		int yMin;
		int xMin;
		int Min;
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		xMin = (x<w-x) ? x : w-x;
		yMin = (y<h-y) ? y : h-y;
		Min = (xMin<yMin) ? xMin : yMin;
		System.out.println(Min);
	}
}
