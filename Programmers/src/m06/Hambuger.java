package m06;

import java.util.ArrayList;
import java.util.List;

public class Hambuger {

	public static void main(String[] args) {
		int[] ingredient = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
		int answer = 0;
		List<Integer> li = new ArrayList<>();

		for (int i : ingredient) {
			li.add(i);
			while (li.size() >= 4) {
				int n = li.size();
				if (!(li.get(n - 1) == 1 && li.get(n - 2) == 3 && li.get(n - 3) == 2 && li.get(n - 4) == 1))
					break;
				for (int j = 0; j < 4; j++) {
					li.remove(li.size() - 1);
				}
				answer++;
			}
		}
	}

}
