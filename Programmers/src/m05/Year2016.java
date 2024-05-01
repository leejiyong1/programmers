package m05;

public class Year2016 {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day= {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int c = -1;
		for(int i=0; i<a-1; i++) {
			c += m[i];
		}
		String answer = day[(c+b)%7];
		System.out.println(answer);
	}

}
