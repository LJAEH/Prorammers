package Studies;

import java.util.LinkedList;
import java.util.Queue;

public class Stu1 {

	public static void main(String[] args) throws Exception{
		
	 try {
	        Queue<Integer> que = new LinkedList<>();
	        
	        boolean bl = que.offer(null); // NullPointerException 발생
	        que.offer(2);
	        que.offer(3);
	        
	        //int front = que.peek();

	        System.out.println("boolean : " + bl);
	        //System.out.println("front : " + front);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
