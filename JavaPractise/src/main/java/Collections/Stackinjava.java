package Collections;

import java.util.Stack;

public class Stackinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Stack<Integer> stack=new Stack<>();
		
		stack.push(1);
		stack.push(13);
		stack.push(14);
		stack.push(1444);
		stack.push(155);
		
		System.out.println(stack);
		
		int num= stack.pop();
		System.out.println(stack);
		
	}

}
