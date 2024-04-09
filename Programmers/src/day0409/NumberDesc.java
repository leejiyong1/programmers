package day0409;

import java.util.Arrays;

public class NumberDesc {
	
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr);
		String s = "";
		for(int i=arr.length-1; i>=0; i--) {
			s += arr[i];
			System.out.println(s);
		}
		answer = Long.parseLong(s);
		
	}

}
