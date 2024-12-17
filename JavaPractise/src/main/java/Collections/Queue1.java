package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer>  queue=new PriorityQueue<>();
		queue.add(2);
		queue.add(24);
		
		queue.add(22);
		queue.add(672);
		
		queue.add(552);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}

}
