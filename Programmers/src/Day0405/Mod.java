package Day0405;


public class Mod {
	
	public static void main(String[] args) {
		String number = "123";
		int answer =0;
		for(int i=0; i<number.length(); i++) {
			answer += number.charAt(i) - '0';
			answer %= 9;
			System.out.println(answer);
		}
		System.out.println(answer);
	}

}
