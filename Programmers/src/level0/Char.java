package level0;

public class Char {
	
	public static void main(String[] args) {
		String my_string = "adadasdwweweqz";
		int[] answer = new int[52];
//		int n = 0;
//		for(char i='A'; i<='Z'; i++) {
//			for(int j=0; j<my_string.length(); j++) {
//				if(i == my_string.charAt(j)) {
//					answer[n]++;					
//				}
//			}
//			n++;
//		}
//		for(char i='a'; i<='z'; i++) {
//			for(int j=0; j<my_string.length(); j++) {
//				if(i == my_string.charAt(j)) {
//					answer[n]++;					
//				}
//			}
//			n++;
//		}
		for(int i=0; i<my_string.length(); i++) {
			char c = my_string.charAt(i);
			if('a'<= c) {
				answer[c - 'a'+26]++;
			}else {
				answer[c -'A']++;
			}
		}
		for(int i=0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
