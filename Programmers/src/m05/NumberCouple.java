package m05;

public class NumberCouple {
	
	
	public static void main(String[] args) {
		String X = "100";
		String Y = "2345";
		
		 String answer = "";
	        
	        StringBuilder sb = new StringBuilder();
	        
	        int[] xArr = new int[10];
	        int[] yArr = new int[10];
	        
	        for(String x : X.split("")){
	            xArr[Integer.parseInt(x)]++;
	        }
	        for(String y : Y.split("")){
	            yArr[Integer.parseInt(y)]++;
	        }
	        
	        for(int i = 9 ; i >= 0 ; i--){
	            
	            while(xArr[i]>0 && yArr[i]>0){
	                sb.append(i);
	                
	                xArr[i]--;
	                yArr[i]--;
	            }
	        }
	        
	        if(sb.toString().startsWith("0")){
	            answer = "0";
	        } else if(sb.toString().equals("")){
	            answer = "-1";
	        }
	        
	        answer = sb.toString();
	}

}
