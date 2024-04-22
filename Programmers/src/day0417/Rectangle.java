package day0417;

public class Rectangle {
	
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int answer = 0;
		int max_v=0;
        int max_h=0;
		for(int i = 0; i<sizes.length; i++) {
			int v=Math.max(sizes[i][0],sizes[i][1]);//60,70,60,80
            int h=Math.min(sizes[i][0],sizes[i][1]);//50,30,30,40
            max_v=Math.max(max_v,v);//60,70,60,80
            max_h=Math.max(max_h,h);//50
		}
		answer = max_h * max_v;
		System.out.println(answer);
	}

}
