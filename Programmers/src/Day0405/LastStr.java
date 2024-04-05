package Day0405;

public class LastStr {
	
	public static void main(String[] args) {
		int n = 11;
		String my_string = "ProgrammerS123";
		String answer = "";
		answer = my_string.substring(my_string.length()-n);
		System.out.println(answer);
	}

}
