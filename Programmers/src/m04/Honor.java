package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Honor {
	
	public static void main(String[] args) {
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 3;
		
		int[] answer = new int[score.length];
		
        List<Integer> rank = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            
            answer[i] = Collections.min(rank);
            System.out.println(answer[i]);
        }
		
	}

}
