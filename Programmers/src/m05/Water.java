package m05;

public class Water {
	
	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		String answer = "Yes";
		int idx = 0;
		int idx2 = 0;
		for(int i = 0; i<goal.length; i++) {
			if(idx < cards1.length&& goal[i].equals(cards1[idx])) {
				idx++;
			}else if(idx2<cards2.length&&goal[i].equals(cards2[idx2])) {
				idx2++;
			}else {
				answer = "No";
				break;
			}
		}
		System.out.println(answer);
		
	}

}
