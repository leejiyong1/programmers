package day0411;

public class NotNumber {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 0;
		for(int i=0;i<=9; i++) {
			int c =0;
			for(int j=0; j<numbers.length; j++) {
				if(numbers[j] != i) {
					c++;
				}
			}
			if(c == numbers.length) {
				answer +=i;
			}
		}
		System.out.println(answer);
	}

}
