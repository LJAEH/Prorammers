package problems;

public class No4 {
	
	public static void main(String[] args) {
	
		No4 no4 = new No4();
		no4.sol();
	}
	
	public int sol() {
		
		String t = "10203";
		String p = "15";
		
		Long pValue = Long.parseLong(p);
		
		int answer = 0;
				
		for(int i = 0; i <= t.length()-p.length(); i++) {
			
			long tValue = Long.parseLong(t.substring(i,i+p.length()));
			if(tValue <= pValue ) {
				answer ++;
			}
		}
		System.out.println("정답 : "+ answer);
		return answer;
	}
	
}
