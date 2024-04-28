package m04;

public class Coke {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 1;
		int n = 20;//10,5,2,2
		int answer = 0;
		int bin =0;
//		while(true) {
//			bin = n%a;
//			n /= a;
//			
//			answer +=n;
//			if(bin>0) {
//				n +=bin;
//				bin =0;
//			}
//			if(n<a) {
//				break;
//			}
//		}
		while(n >= a){
            answer += (n / a)*b;
            n = (n / a)*b + (n % a);
        }
		System.out.println(answer);
	}

}
