package Collections;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Queue;

public class dequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		dq.add(2);
		dq.add(24);
		dq.add(245);
		dq.add(34);
		dq.add(33);
		
		System.out.println(dq);
		
		dq.addFirst(0);
		dq.addFirst(78);
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		
	}

}
