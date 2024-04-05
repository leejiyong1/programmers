package level1;

public class BackStr {
	
	public static void main(String[] args) {
		String my_string = "mydseses";
		int s = 1;
		int e = 4;
		StringBuffer answer = new StringBuffer(my_string.substring(s, e+1));
		answer.reverse();
//		int n =e;
//		if(my_string.length()>e) {
//			for(int i=0; i<my_string.length(); i++) {
//				if(i>=s &&i<=e) {
//					System.out.println(my_string.charAt(n));
//					answer += my_string.charAt(n);
//					n--;
//				}else {
//				answer +=my_string.charAt(i);
//				}
//			}
//		}
		
		System.out.println(my_string.substring(0,s)+answer+my_string.substring(e+1));
		//msesdyes;
	}

}
