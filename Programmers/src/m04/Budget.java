package m04;

import java.util.Arrays;

public class Budget {
	
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budger = 9;
		
		int answer = 0;
		int[] s = d;
		Arrays.sort(s);
		for(int i=0; i<s.length; i++) {
				budger -= s[i];
				answer++;
			if(budger <0) {
				answer--;
				budger += s[i];
				break;
			}
		}
		System.out.println(answer);
	}

}
