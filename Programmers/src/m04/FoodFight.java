package m04;

public class FoodFight {
	public static void main(String[] args) {
		int[] food = { 1, 3, 4, 6 };
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < food.length; i++) {
			int count = food[i] / 2;
			sb.append(String.valueOf(i).repeat(count));
		}

		String answer = sb + "0";
		answer += sb.reverse();
		System.out.println(answer);
	}

}
