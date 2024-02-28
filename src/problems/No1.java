package problems;

public class No1 {
	
	public static void main(String[] args) {
		
		No1 no1 = new No1();
		//boolean result = no1.answer();
		int resultInt = no1.prom2();
		
		//System.out.println("참거짓 : "+result);
	}

	public boolean answer() {
	    
		String s = null;
	        
    	boolean answer = true;
        
    	s = "pPoooYy";
    	
    	int pCnt = 0;
    	int yCnt = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
    		
    		System.out.println(i + " : subString "+s.substring(i,i+1));
    		
    		if(s.substring(i,i+1).toLowerCase().equals("p")) {
    			pCnt++;
    		}
    		if(s.substring(i,i+1).toLowerCase().equals("y")) {
    			yCnt++;
    		}
    	}
    	
    	System.out.println("pCnt : "+pCnt);
    	System.out.println("yCnt : "+yCnt);
    	
    	if(pCnt==yCnt) {
    		answer = true;
    	} else {
    		answer = false;
    	}
    	
        return answer;
	    
	}
	
	public int prom2() {
		
		String s = null;
		
		s= "1234";
		
		int calcUtil = 0;
		
		if(s.substring(0,1).equals("-")) {
			calcUtil = (-1)*Integer.valueOf(s.substring(1,s.length()));
			System.out.println("변환 숫자 : " + calcUtil);
		} else if(s.substring(0,1).equals("+")) {
			calcUtil = Integer.valueOf(s.substring(1,s.length()));
			System.out.println("변환 숫자 : " + calcUtil);
		} else {
			calcUtil = Integer.valueOf(s.substring(0,s.length()));
			System.out.println("변환 숫자 : " + calcUtil);
		}
			
		
		return calcUtil; 
	}

	public long prom3() {
		
		return 0;
	}

}
