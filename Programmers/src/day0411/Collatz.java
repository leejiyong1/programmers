package day0411;

public class Collatz {
	
	public static void main(String[] args) {
		long num = 1;
		int answer = 0;
		while(true) {
			if(num == 1) {
				break;
			}
			if(num % 2 ==0) {
				num /=2;
				answer++;
			}else {
				num = num*3+1;
				answer++;
			}
			if(answer ==500) {
				answer = -1;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
