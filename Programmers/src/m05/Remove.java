package m05;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	
	public static void main(String[] args) {
		String[] strArr = {"and","notad","abcd"};
		List<String> answer = new ArrayList<>();
		for(String str:strArr) {
			if(!str.contains("ad")) {
				answer.add(str);
			}
		}
		System.out.println(answer.toArray(new String[0]));
	}

}
