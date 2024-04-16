package day0416;

import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		List<Integer> list = new ArrayList<>();
		int value = -1;
		for(int i= 0;i<arr.length; i++) {
			if(arr[i] != value) {
				list.add(arr[i]);
				value= arr[i];
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
	}

}
