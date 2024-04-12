package day0412;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		for(int j =0; j<s.length(); j++) {
		for(char i ='z'; i>='A'; i--) {
			if(s.charAt(j) == i) {
			}
		}
		}
		System.out.println(answer);
	}

}
