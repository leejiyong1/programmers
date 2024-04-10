package day0410;

import java.util.Arrays;

public class ModNumber {
	
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 5;
		int n = 0;
		int c = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] % divisor ==0) {
				n++;
			}
		}
		
		if(n == 0) {
			int[] answer = {-1};
		}
		int[] answer =new int[n];
		for(int i =0; i<arr.length; i++) {
			if(arr[i] % divisor ==0) {
				answer[c] = arr[i];
				c++;
			}
		}
		Arrays.sort(answer);
	}

}
