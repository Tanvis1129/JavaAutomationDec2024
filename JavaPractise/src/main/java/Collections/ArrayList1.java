package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Pineapple");
		
		System.out.println(fruits);
		System.out.println("-----------------------------");
		
		//foreach loop
		
		for (String s : fruits)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------------");
		
		
		//by iterator
		
		Iterator<String> itr = fruits.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------");
		
		fruits.removeFirst();
		System.out.println(fruits);
		
		fruits.removeLast();
		System.out.println(fruits);
		}

}
