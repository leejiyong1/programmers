package m05;

import java.util.ArrayList;
import java.util.List;

public class MockExam {

	public static void main(String[] args) {
		int[] one = {1,2,3,4,5};
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] score = {0,0,0};
		int[] answers = {1,2,3,4,5};
		for(int i = 0; i<answers.length; i++) {
			if(one[i%5] == answers[i]) {
				score[0]++;
			}
			if(two[i%8] == answers[i]) {
				score[1]++;
			}
			if(three[i%10]== answers[i]) {
				score[2]++;
			}
		}
		int max = Math.max(score[0], Math.max(score[1], score[2]));
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<score.length; i++) {
			if(max == score[i]) {
				list.add(i+1);
			}
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
	}

}