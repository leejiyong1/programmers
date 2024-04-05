package Day0405;

public class Length {
	
	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		String answer = "";
		for(int i=c-1; i<my_string.length(); i += m) {
			answer += my_string.charAt(i);
		}
		System.out.println(answer);
	}

}
