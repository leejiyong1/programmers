package day0412;

public class WaterMelon {
	
	public static void main(String[] args) {
		int n = 4;
		String answer = "";
		for(int i = 1; i<=n; i++) {
			answer += i%2 !=0 ? "수":"박";
		}
		System.out.println(answer);
	}

}
