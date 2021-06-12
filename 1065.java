import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;
		int result=0;
		N=sc.nextInt();
		int[] ar = new int[3];		
		
		for(int i=1;i<=N;i++){
			if(i<100)
				result++;
			else if(i>=100 && i<1000){
				ar[0] = i/100;
				ar[1] = (i-ar[0]*100)/10;
				ar[2] = (i-ar[0]*100-ar[1]*10);
				if(ar[2]-ar[1]==ar[1]-ar[0])
					result++;
			}
			else
				break;
		}
		System.out.println(result);
	}
}
