package day0416;

public class StringBoolean {

	public static void main(String[] args) {
		String s = "a1234";
		boolean answer = false;
		if (s.length() == 4 || s.length() == 6) {
			try {
				int a = Integer.parseInt(s);
				answer = true;
			} catch (Exception e) {
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
