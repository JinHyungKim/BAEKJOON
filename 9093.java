import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		for(int i=0;i<N;i++){
			String srcStr = sc.nextLine();
			StringTokenizer st =new StringTokenizer(srcStr, " ");
			while(st.hasMoreTokens()){
				StringBuffer sb = new StringBuffer(st.nextToken());
				String reversedStr = sb.reverse().toString();
				System.out.print(reversedStr+" ");
			}
			System.out.println();
		}
	}
}
