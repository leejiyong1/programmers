package day0408;

public class Increase {
	
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long[] answer =new long[n];
		long num = x;
		for(int i=0;i<answer.length;i++) {
			answer[i] = num;
			num +=x;
		}
		System.out.println(answer);
	}

}
