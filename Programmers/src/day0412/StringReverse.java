package day0412;

import java.util.Arrays;
import java.util.Collections;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		String[] str = s.split("");
		Arrays.sort(str,Collections.reverseOrder());
		for(String a: str) {
			answer+=a;
		}
		System.out.println(answer);
	}

}
