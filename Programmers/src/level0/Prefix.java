package level0;

public class Prefix {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";
		int answer = 0;
		String str = "";
//		if (my_string.length() >= is_prefix.length()) {
//			for (int i = 0; i < is_prefix.length(); i++) {
//				str += my_string.charAt(i);
//			}
//		}
//		if (str.equals(is_prefix)) {
//			answer = 1;
//		}
//	        if(my_string.indexOf(is_prefix) == 0){
//	            answer = 1;
//	        }
		if(my_string.startsWith(is_prefix)) {
			answer=1;
		}
		System.out.println(answer);
	}

}
