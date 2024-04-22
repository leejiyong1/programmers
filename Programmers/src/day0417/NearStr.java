package day0417;

public class NearStr {
	
	public static void main(String[] args) {
		String s = "banana";
		int[] answer = new int[s.length()];
		answer[0] = -1;
		for(int i=1; i<s.length(); i++) {
			for(int j=i-1; j>=0; j--) {
				if(s.charAt(i) == s.charAt(j)) {
					answer[i] = i-j;
					break;
				}else {
					answer[i] = -1;
				}
			}
		}
		
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
