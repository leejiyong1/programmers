package m05;

public class EN {

	public static void main(String[] args) {
		String s = "23four5six7";
		int answer = 0;
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for(int i=0; i<number.length; i++) {
			if(s.contains(number[i])) {
				s = s.replaceAll(number[i], Integer.toString(i));
			}
		}
		answer = Integer.parseInt(s);
		System.out.println(answer);
	}

}
