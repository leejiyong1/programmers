package m05;

public class Sosu2 {
	
	public static boolean isp(int num) {
		int cnt =0;
		for(int i = 2; i<=num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int answer =0;
		for(int i=0; i<nums.length; i++) {
			int sum = 0;
			for(int j=i+1;j<nums.length; j++) {
				for(int k=j+1;k<nums.length; k++) {
					sum = nums[i]+nums[j]+nums[k];
					if(isp(sum)) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}

}
