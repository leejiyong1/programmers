package day0412;

public class PlusMinus {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}

			answer += c % 2 == 0 ? +i : -i;
		}
		System.out.println(answer);

	}

}
