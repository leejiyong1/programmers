package day0409;

public class PlusX {
	
	public static void main(String[] args) {
		int x = 11;
		boolean answer = true;
		String n = Integer.toString(x);
		int s = 0;
		for(int i =0; i<n.length();i++) {
			s += n.charAt(i)-'0';
		}
		if(x % s !=0) {
			answer =false;
		}
		System.out.println(answer);
		
	}

}
