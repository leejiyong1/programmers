package m04;

public class Map {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		String temp;
		for (int i = 0; i < n; i++) {
			temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
			System.out.println(temp);
			temp = temp.substring(temp.length() - n);
			temp = temp.replaceAll("1", "#");
			temp = temp.replaceAll("0", " ");
			answer[i] = temp;
		}
		for(int i= 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
