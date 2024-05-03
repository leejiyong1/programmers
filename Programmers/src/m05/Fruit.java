package m05;

import java.util.Arrays;

public class Fruit {

	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};//1,1,2,2,2,2,4,4,4,4,4,4
		int answer = 0; 
		Arrays.sort(score);
		for(int i = score.length-m; i>=0; i-=m) {
			answer += score[i]*m;//12,12,6,3
		}
		System.out.println(answer);
		
	}

}
