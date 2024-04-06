package day0406;

public class Arithmetic {
	
	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = {true,false,false,true,true};
		int answer = 0;
		for(int i= 0;i<included.length; i++) {
			if(included[i] == true) {
				answer +=a;
			}
			a += d;			
		}
		System.out.println(answer);
	}

}
