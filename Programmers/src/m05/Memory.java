package m05;

public class Memory {
	
	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
		int[] answer = new int[photo.length]; 
		for(int i =0; i<photo.length; i++) {
			for(int j= 0;j<photo[i].length; j++) {
				for(int k =0; k<name.length; k++) {
				if(photo[i][j].equals(name[k])) {
					answer[i] +=yearning[k];
				}
				}
			}
		}
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
