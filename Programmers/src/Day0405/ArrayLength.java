package Day0405;

public class ArrayLength {
	
	public static void main(String[] args) {
		int[] num_list = {2, 3, 4, 5};
		int answer = 1;
		if(num_list.length >=11) {
			for(int i=0;i<num_list.length;i++) {
				answer+= num_list[i];
			}
			answer -=1;
		}else {
			for(int i= 0;i<num_list.length; i++) {
				answer *= num_list[i];
			}
		}
		System.out.println(answer);
	}

}
