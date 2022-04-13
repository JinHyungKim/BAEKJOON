import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	private static StringBuilder sb = new StringBuilder();
	private static Node[] arr;
	private static int N;
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new Node[N];
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			arr[str.charAt(0)-65] = new Node(str.charAt(0), str.charAt(2), str.charAt(4));
		}
//		for(int i=0;i<N;i++)
//			System.out.println(arr[i]);
		preOrder('A');
		sb.append("\n");
		inOrder('A');
		sb.append("\n");
		postOrder('A');
		sb.append("\n");
		System.out.println(sb);
		
	}
	private static void preOrder(char curr) {
		sb.append(curr);
		if(arr[curr-65].l!='.') {
			preOrder(arr[curr-65].l);
		}
		if(arr[curr-65].r!='.') {
			preOrder(arr[curr-65].r);
		}
	}
	private static void inOrder(char curr) {
		if(arr[curr-65].l!='.') {
			inOrder(arr[curr-65].l);
		}
		sb.append(curr);
		if(arr[curr-65].r!='.') {
			inOrder(arr[curr-65].r);
		}
	}
	private static void postOrder(char curr) {
		if(arr[curr-65].l!='.') {
			postOrder(arr[curr-65].l);
		}
		if(arr[curr-65].r!='.') {
			postOrder(arr[curr-65].r);
		}
		sb.append(curr);
	}
	
	private static class Node{
		char node;
		char l, r;
		public Node(char node, char l, char r) {
			this.node = node;
			this.l = l;
			this.r = r;
		}
		@Override
		public String toString() {
			return "Node [node=" + node + ", l=" + l + ", r=" + r + "]";
		}
		
	}
}