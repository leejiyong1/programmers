package level1;

import java.util.Arrays;

public class Suffix {
	
	public static void main(String[] args) {
		
		String my_string = "banana";
		String[] answer = new String[my_string.length()];
		String[] answer2 = new String[my_string.length()];
		for(int i=0; i<my_string.length(); i++) {
			answer2[i] = my_string.substring(i);
		}
		Arrays.sort(answer2);
		answer = answer2;
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
