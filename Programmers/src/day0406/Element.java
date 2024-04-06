package day0406;

public class Element {
	
	public static void main(String[] args) {
		int[] num_list = {2,1,6};
		int[] answer = new int[num_list.length+1];
		for(int i=0; i<num_list.length; i++) {
			answer[i] = num_list[i];
		}
			answer[answer.length-1] = (answer[num_list.length-1]> answer[num_list.length-2]) ? (answer[num_list.length-1]- answer[num_list.length-2]):answer[num_list.length-1]*2;
			System.out.println(answer[answer.length-1]);
	}

}
