import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rank = new int[N];
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int j=0;j<N;j++){
			int weight = arr[j][0];
			int height = arr[j][1];
			int myRank=1;
			for(int i=0;i<N;i++){
				if(i==j){
					//blank
				}
				else{
					if(weight<arr[i][0] && height<arr[i][1])
						myRank++;
				}
			}
			rank[j] = myRank;
		}

		for(int e:rank){
			System.out.print(e+" ");
		}
	}
}
