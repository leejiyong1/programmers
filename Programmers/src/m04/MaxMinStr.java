package m04;

public class MaxMinStr {
	
	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		
		int answer = 0;
		for(int i=0; i<t.length()-p.length()+1; i++) {
			String str = t.substring(i,i+p.length());
			if(Long.parseLong(str)<=Long.parseLong(p)) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
