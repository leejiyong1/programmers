package dat0408;

public class AVG {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double answer = 0;
		int sum = 0;
		for(int i=0;i<arr.length; i++) {
			sum += arr[i];
		}
		answer = (double)sum/arr.length;
		System.out.println(answer);
	}

}
