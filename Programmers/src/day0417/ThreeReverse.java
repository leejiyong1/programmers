package day0417;

public class ThreeReverse {
	
	public static void main(String[] args) {
		int n = 45;
		int answer = 0;
		while(n > 0) {
			answer = answer * 3 + n %3;//0,0,2,7
			n = n/3;//15,5,1,0
		}
		
		System.out.println(answer);
	}

}
