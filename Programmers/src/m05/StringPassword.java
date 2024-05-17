package m05;

public class StringPassword {
	
	public static void main(String[] args) {
		String s = "a B z";
		int n = 1;
		String answer = "";
		System.out.println((int)s.charAt(0));
		for(int i=0; i<s.length(); i++) {
			int c = s.charAt(i);
			int t = 0;
			if(c<=90&& c>=65) {
				t = c + n;
				if(t>90) {
					t = (t-90) +64 ;
				}
			}else if(c<=122 &&c>=97){
				t = c +n;
				if(t>122) {
					t = (t-122) + 96;
				}
			}else if(s.charAt(i) == ' ') {
				answer += s.charAt(i);
				continue;
			}
			answer +=(char)t;
		}
		System.out.println(answer);
	}

}
