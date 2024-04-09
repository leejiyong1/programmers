package day0409;

public class NumberArray {
	
	public static void main(String[] args) {
		long n = 12345L;
		String s = Long.toString(n);
		int[] answer = new int[s.length()];
		int c = s.length()-1;
		for(int i=0; i<answer.length; i++) {
			answer[i] = s.charAt(c) - '0';
			c--;
		}
		for(int an :answer) {
			System.out.println(an);
		}
	}

}
