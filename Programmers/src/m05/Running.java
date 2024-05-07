package m05;

import java.util.HashMap;
import java.util.Map;

public class Running {
	
	public static void main(String[] args) {
		
		String[] players= {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] answer = new String[players.length];
		//틀린코드(시간초과)
//		for(int i=0;i<callings.length;i++) {
//			for(int j=0;j<players.length; j++) {
//				if(callings[i].equals(players[j])) {
//					String str = players[j-1];
//					players[j-1] = players[j];
//					players[j] = str;
//				}
//			}
//		}
//		System.arraycopy(players, 0, answer, 0, players.length);
//		for(int i= 0; i<answer.length; i++) {
//			System.out.println(answer[i]);
//		}
		Map<Integer, String> players2 = new HashMap<>();
		Map<String, Integer> rank = new HashMap<>();
		for(int i=0;i<players.length; i++) {
			players2.put(i, players[i]);
			rank.put(players[i], i);
		}
		for(int i=0; i<callings.length; i++) {
			int currentPlayers = rank.get(callings[i]);
			String rankPlayers = players2.get(currentPlayers);
			String frontPlayers = players2.get(currentPlayers-1);
			players2.put(currentPlayers, frontPlayers);
			players2.put(currentPlayers-1, rankPlayers);
			
			rank.put(frontPlayers, currentPlayers);
			rank.put(rankPlayers,currentPlayers-1);
		}
		for(int i =0; i<answer.length;i++) {
			answer[i] = players2.get(i);
			System.out.println(answer[i]);
		}
	}

}
