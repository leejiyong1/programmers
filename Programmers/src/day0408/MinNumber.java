package day0408;

public class MinNumber {
	public static void main(String[] args) {
	int n = 12;
	int answer = 0;
	
	for(int i= n; i>1; i--) {
		if(n % i == 1) {
			answer = i;
		}
	}
	System.out.println(answer);
	}
}
