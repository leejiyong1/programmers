package day0412;

public class Price {
	
	public static void main(String[] args) {
		int price = 3;
		int count = 4;
		int money = 20;
		long answer = -1;
		long sum =0;
		for(int i=1; i<=count; i++) {
			sum += price *i;
		}
		answer = money-sum > 0 ? 0 : (money-sum)*-1;
		System.out.println(answer);
	}

}
