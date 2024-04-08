package dat0408;

public class StringPY {
	
	public static void main(String[] args) {
		String s = "pPoooyY";
		s= s.toLowerCase();
		boolean answer = true;
		int c = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'p') {
				c++;
			}
			else if(s.charAt(i) == 'y') {
				c--;
			}
		}
		if(c != 0) {
			answer = false;
		}
	}

}
