package day0406;

public class ZeroMinus {
	
	public static void main(String[] args) {
		String n_str = "8908";
		String answer = "";
		for(int i=0; i<n_str.length(); i++) {
			int c = n_str.charAt(i) - '0';
			if(c > 0) {
				answer = n_str.substring(i);
				break;
			}
		}
		System.out.println(answer);
	}

}
