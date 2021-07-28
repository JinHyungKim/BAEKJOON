/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Client implements Comparable<Client>{
    int age;
    String name;
    public Client(int a, String s){
        age = a;
        name = s;
    }
    @Override
    public int compareTo(Client c){
        return age - c.age;
    }
    @Override
    public String toString(){
        return String.valueOf(age) +" "+ name; 
    }
}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    int N = Integer.parseInt(br.readLine());
	    List<Client> arr = new ArrayList<>();
	    
	    for(int i=0;i<N;i++){
	        st = new StringTokenizer(br.readLine(), " ");
	        arr.add(new Client(Integer.parseInt(st.nextToken()), st.nextToken()));
	    }
	    Collections.sort(arr);
	    for(int i=0;i<N;i++)
	        System.out.println(arr.get(i));
	}
}
