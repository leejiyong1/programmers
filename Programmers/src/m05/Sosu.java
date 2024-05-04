package m05;

public class Sosu {
	public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		int n = 10;
		int answer= 0;
		int[] arr = new int[n+1];
        for(int i=2; i<n+1; i++) {
            if(isPrime(i)) {
                answer++;
            }
                
        }
		System.out.println(answer);
	}
}
