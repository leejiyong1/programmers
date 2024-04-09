package day0409;

public class Root {
	
	public static void main(String[] args) {
		long n = 123l;
		long answer = 0;
		long x = 1l;
		
		while(true) {
			long multi = x *x;
			if(multi == n) {
				answer = (x+1)*(x+1);
				break;
			}else if(multi > n) {
				answer = -1;
				break;
			}else {
				x++;
			}
		}
	}

}
