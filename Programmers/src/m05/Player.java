package m05;

import java.util.HashMap;
import java.util.Map;

public class Player {
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		
		String[] completion = {"eden", "kiki"};
		
		String answer = "";
		Map<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
	}

}
