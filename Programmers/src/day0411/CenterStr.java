package day0411;

public class CenterStr {
	
	public static void main(String[] args) {
		String s = "abc";
		String answer = "";
		int len = s.length();
		//answer = len%2 ==0 ?  s.substring(len/3,len/3+2):s.substring(len/2,(len/2)+1);
		if(len % 2 == 0) {
			
			answer = s.substring(len/2-1,len/2+1);
		}else {
			answer = s.substring(len/2,len/2+1);
		}
		
		System.out.println(answer);
		
	}

}
