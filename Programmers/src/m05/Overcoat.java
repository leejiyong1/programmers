package m05;


public class Overcoat {
	
	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = {2,3,6};
		int start = section[0];
		int answer = 0;
		answer++;
		for(int i : section) {
			if(start+m >i) {
				continue;
			}
			start = i;
			answer++;
		}
		System.out.println(answer);
	}

}
