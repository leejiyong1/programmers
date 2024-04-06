package day0406;

public class TrimSprilt {
	
	public static void main(String[] args) {
		String my_string = " i    love  you";
		String[] answer = my_string.trim().split("\s+");
		for(int i=0;i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
