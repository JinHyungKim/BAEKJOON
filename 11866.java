import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
     public static void main(String []args) throws java.lang.Exception{
        Queue<Integer> srcQ = new LinkedList<>();
        int count=1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        for(int i=1;i<=N;i++)
            srcQ.offer(i);
        if(K==1){
            bw.write("<");
            while(srcQ.peek()!=null){
                if(srcQ.size()==1)
                    bw.write(srcQ.poll()+"");
                else{
                    bw.write(srcQ.poll()+"");
                    bw.write(", ");
                }
            }
            bw.write(">");
        }    
        else{
            bw.write("<");
            while(srcQ.peek()!=null){
                if(count == K){
                    if(srcQ.size()==1)
                        bw.write(srcQ.poll()+"");
                    else{
                        bw.write(srcQ.poll()+"");
                        bw.write(", ");
                    }
                    count = 1;
                }
                srcQ.offer(srcQ.poll());
                count++;
            }
            bw.write(">");
        }
        bw.flush();
        bw.close();
     }
}
