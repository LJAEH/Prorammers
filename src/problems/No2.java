package problems;

import java.util.HashMap;
import java.util.Map;

public class No2 {
	public static void main(String[] args) {
		No2 no2 = new No2();
		//no2.solution();
		no2.race();
	}
	
	public int[] solution( ) {
		
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
        	
        	String[] photoN = photo[i];
        	int answerN = 0;
        	
        	for(int j = 0; j < photoN.length; j++) {
        		for(int x = 0; x < name.length; x++) {
        			if(name[x].equals(photoN[j])) {
        				System.out.println(name[x]);
        				System.out.println(photoN[j]);
        				System.out.println(yearning[x]);
        				answerN += yearning[x];
        				System.out.println(answerN);
        			}else {
        				answerN += 0;
        			}
        		}
        	}
        	
        	answer[i] = answerN;
        	
        }
        

        return answer;
    }
	
	public String[] race() {
		
		String[] result = null;
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		java.util.Map<String,Integer> resultMap = new java.util.HashMap<>();
		
		for(int i =0; i < players.length; i++) {
			resultMap.put(players[i], i);
		}
		
		for(int i = 0; i <callings.length; i++) {
			int cursor = resultMap.get(callings[i]);
			String temp1 = players[cursor-1];
			players[cursor-1] = players[cursor];
			players[cursor] = temp1;
		
			resultMap.put(players[cursor-1], cursor-1);
			resultMap.put(players[cursor], cursor);
		}
		result = players;
		System.out.println(result[0]+result[1]+result[2]+result[3]+result[4]);
		
		return result;
	}
}
