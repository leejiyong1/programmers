package m06;

import java.util.Stack;

public class Crane {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int len = board[0].length;
		int answer = 0;
        Stack<Integer> st = new Stack<>();
        
       for(int mv:moves){
           mv -=1;
           for(int i=0; i<len; i++){  
               if(board[i][mv] != 0){  
                   if(st.size() > 0  && st.peek() == board[i][mv] ){ 
                       st.pop();
                       answer += 2;
                   }else{
                        st.push(board[i][mv]); 
                   }
                   board[i][mv] = 0;
                   break; 
               }
           }  
       } 
	}

}
