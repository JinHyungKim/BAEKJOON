import java.util.Scanner;
import java.util.Stack;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException, NullPointerException{
			
				BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				int N = Integer.parseInt(sc.readLine());	
				int i=0;
				int value;
				int size=0;
				Stack<Integer> stk = new Stack<>();
				
				while(i<N){
					String cmd = sc.readLine();
					String cmdCpy = cmd;
					cmd = cmd.replaceAll("[0-9]", "");
					cmd = cmd.replaceAll(" ", "");
					switch(cmd){
						case "push":
							value =Integer.parseInt(cmdCpy.replaceAll("[^0-9]", ""));
							stk.push(value);
							size++;
							break;
						case "pop":
							if(stk.empty())
								bw.write("-1\n");
							else{
								bw.write(stk.pop()+"\n");
								size--;
							}
							break;
						case "size":
							bw.write(size+"\n");
							break;
						case "empty":
							if(!stk.empty())
								bw.write("0\n");
							else
								bw.write("1\n");
							break;
						case "top":
							if(stk.empty())
								bw.write("-1\n");
							else
								bw.write(stk.peek()+"\n");
							break;	
					}
					i++;
				}
				sc.close();
				bw.flush();
				bw.close();
	}
}
