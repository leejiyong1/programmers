package m05;

import java.util.Arrays;

public class KawNumber {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands[0].length];
		for(int i=0;i<commands.length; i++) {
			int c = commands[i][1] - commands[i][0] + 1;
			int[] arr = new int[c];
			int c2 =0;
			for(int j=0; j<array.length; j++) {
				if(j>=commands[i][0]-1 &&j<=commands[i][1]-1) {
					arr[c2] = array[j];
					c2++;
				}
			}
			Arrays.sort(arr);
			answer[i] = arr[commands[i][2]-1];
		}
		for(int i= 0;i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
