package dat0408;

public class NumberSum {
	
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		for(int i=n; i>0;i--) {
			if(n%i ==0) {
				answer +=i;
			}
		}
		System.out.println(answer);
	}

}
