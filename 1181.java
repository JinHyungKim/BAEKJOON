/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
};
	    
	    int i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		while(N-->0)
		    set.add(br.readLine());
		List<String> lst = new ArrayList<>(set);
		Collections.sort(lst);
		Collections.sort(lst, comparator);
		for(String s:lst)
		    System.out.println(s);
	}
}
