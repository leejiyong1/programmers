package m05;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
	
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		int answer = 0;
		int max = nums.length/2;
		Set<Integer> set = new HashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		
		if(set.size()> max) {
			answer = max;
		}else {
			answer = set.size();
		}
	}

}
