package day0410;

public class NumberSum {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		long answer =0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		for(int i=min;i<=max; i++) {
			answer += (long) i;
		}
		System.out.println(answer);
	}
}
