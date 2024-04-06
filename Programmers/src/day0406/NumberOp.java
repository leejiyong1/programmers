package day0406;

public class NumberOp {
	
	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		for(int i=0;i<control.length(); i++) {
			if(control.charAt(i) == 'w') {
				n +=1;
			}else if(control.charAt(i) == 's') {
				n-=1;
			}else if(control.charAt(i) == 'd') {
				n +=10;
			}else {
				n -=10;
			}
		}
		System.out.println(n);
	}

}
