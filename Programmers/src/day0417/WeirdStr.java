package day0417;

public class WeirdStr {

	public static void main(String[] args) {
		String s = "try hello world";
		String[] a = s.split("");
		String answer = "";
		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals(" ")) {
				idx =0;
			}else {
			a[i] = idx % 2 == 0 ? a[i].toUpperCase() : a[i].toLowerCase();
			idx++;
			}
			answer += a[i];
		}
		
		String[] b = s.split(" ");
		String answer2 = "";
		for(int i= 0; i<b.length; i++) {
			for(int j=0;j<b[i].length(); j++) {
				answer2 += j%2 ==0 ? b[i].toUpperCase().charAt(j) : b[i].toLowerCase().charAt(j);
			}
			answer2 += " ";
		}
		System.out.println(answer);
		System.out.println(answer2);
		System.out.println(answer2.equals("TrY HeLlO WoRlD"));
		System.out.println(answer.equals("TrY HeLlO WoRlD"));
	}

}
