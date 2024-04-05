package level1;

public class Array {
	
	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] answer = new int[n/k];
		for(int i=0; i<answer.length; i ++) {
			answer[i] =k * (i+1);
		}
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
