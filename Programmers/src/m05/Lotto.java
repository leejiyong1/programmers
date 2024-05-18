package m05;

public class Lotto {
	
	public static void main(String[] args) {
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] r = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        
        for (int i = 0; i < lottos.length; i ++) {
            if (lottos[i] == 0) {
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        
        // 순위에 따른 등수로 변환
        answer[0] = r[answer[0]];
        answer[1] = r[answer[1]];
	}

}
