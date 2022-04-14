import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	private static int cnt = 0;
	private static int X;
	private static int[] parent;
	private static ArrayList<Integer>[] child;
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		parent = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(br.readLine());
		child = new ArrayList[N];
		
		for(int i=0;i<N;i++) {
			parent[i] = Integer.parseInt(st.nextToken());
			child[i] = new ArrayList<Integer>();
		}		
		int root = -1;
		for(int i=0;i<N;i++) {
			if(parent[i]==-1) {
				root = i;
				continue;
			}
			else {
				child[parent[i]].add(i);
			}
		}
		//System.out.println(Arrays.toString(parent));
		if(root!=X)
			dfs(root);
		System.out.println(cnt);
	}
	
	private static void dfs(int currNode) {
	//	System.out.println(currNode);
		if(child[currNode].isEmpty()||(child[currNode].size()==1&&child[currNode].get(0)==X)) {
			cnt++;
		}
		for(int i=0;i<child[currNode].size();i++) {
			if(child[currNode].get(i)==X)
				continue;
			dfs(child[currNode].get(i));
		}
	}
}