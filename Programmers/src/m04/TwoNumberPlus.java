package m04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberPlus {
	
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};//1,1,2,3,4=2,3,4,5,6,7
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i<numbers.length; i++) {
			for(int j=i+1;j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		int[] answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
		
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
