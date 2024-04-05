package Day0405;

public class StrCover {
	
	public static void main(String[] args) {
		String my_string = "He11oWor1d";
		String overwrite_string = 	"lloWorl";
		int n = 2;
		String answer = my_string.substring(0,n)+overwrite_string;
		answer += my_string.substring(answer.length());
		System.out.println(answer);
	}

}
