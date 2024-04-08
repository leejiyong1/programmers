package dat0408;

public class NumberDig {
	
	public static void main(String[] args) {
		int n = 123;
		int answer = 0;
		while(n>0) {
			answer += n%10;
			n /=10;
		}
		System.out.println(answer);
	}

}
