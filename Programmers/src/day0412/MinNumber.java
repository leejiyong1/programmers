package day0412;

import java.util.Arrays;

public class MinNumber {
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] answer;			
		if(arr.length >1) {
			answer = new int[arr.length-1];
			int min = arr[0];
			for(int i=0;i<arr.length; i++) {
				min = Math.min(min, arr[i]);
			}
			int c = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] != min) {
					answer[c] = arr[i];
					c++;
				}
			}
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		
		
	}

}
