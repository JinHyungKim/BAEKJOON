import java.util.*;
import java.lang.*;
import java.io.*;

class Pos implements Comparable<Pos>{
    int x;
    int y;
    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Pos p){
        int diff = this.y - p.y;
        if(diff == 0)
            diff = this.x - p.x;
        return diff;
    }
    
    @Override
    public String toString(){
        return String.valueOf(x)+" "+String.valueOf(y)+"\n";
    }
}

public class Main{
    public static void main (String []args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Pos[] arr = new Pos[N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(arr);
        for(Pos s:arr)
            sb.append(s);
        System.out.println(sb.toString());
    }
}
