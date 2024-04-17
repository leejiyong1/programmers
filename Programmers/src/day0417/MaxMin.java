package day0417;

public class MaxMin {
	
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int[] answer = new int[2];
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		while(min != 0) {
			int r = max % min;
			max = min;
			min = r;
		}
		answer[0] = max;
		answer[1] = n * m/max;
		
	}
	

}
