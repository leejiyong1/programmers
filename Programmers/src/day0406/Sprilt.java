package day0406;

import java.util.ArrayList;
import java.util.List;

public class Sprilt {
	
	public static void main(String[] args) {
		String my_string = "i love you";
		String[] answer = my_string.split(" ");
		for(int i=0;i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
