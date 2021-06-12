import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;
		int result=0;
		int length;
		int i = 0;
		N = sc.nextInt();
		String number = String.valueOf(N);
		length = number.length();

		length *= 9;
		while(i<length){
			if(N==func(N-length+i)){
				result = N-length+i;
				break;
			}
			i++;
		}
		System.out.println(result);
	}

	public static int func(int num){
		String number = String.valueOf(num);
		char[] digits1 = number.toCharArray();
		int sum =0;
		for(char e:digits1){
			int i = e-'0';
			sum += i;
		}
		return sum+num;
	}

}
