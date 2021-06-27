import java.util.*;
import java.lang.*;
import java.io.*;

class PrintThings{
    int importance;
    boolean wantToPrint;
    public PrintThings(int a, boolean b){
        importance = a;
        wantToPrint = b;
    }
    public boolean getBoolean(){
        return wantToPrint;
    }
    public String toString(){
        return importance+"";
    }
    public int getImportance(){
        return importance;
    }
}

public class Main{
     public static void main(String []args)throws java.lang.Exception{
        int N, M, imp;
        Queue<PrintThings> q = new LinkedList<>();
        ArrayList<Integer> importanceArray = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i=0;i<testCase;i++){
            int count = 1;

            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<N;j++){
                imp = Integer.parseInt(st.nextToken());
                importanceArray.add(imp);
                if(j==M){
                    q.offer(new PrintThings(imp, true));
                }
                else{
                    q.offer(new PrintThings(imp, false));
                }
            }
            // System.out.println(q);
            Collections.sort(importanceArray, Collections.reverseOrder());
            // System.out.println(importanceArray);
            while(count<=N){
                if((q.peek()).getBoolean()&&importanceArray.get(0) == (q.peek()).getImportance()){
                    // System.out.println("1번");
                    break;
                }
                else if(importanceArray.get(0) == (q.peek()).getImportance()){
                    // System.out.println("2번");
                    q.poll();
                    importanceArray.remove(0);
                    count++;
                }
                else{
                    q.offer(q.poll());
                    // System.out.println("3번");
                }
                
            }
            System.out.println(count);
            importanceArray.clear();
            q.clear();
        }
     }
}
