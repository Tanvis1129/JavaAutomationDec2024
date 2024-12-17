package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class arraylistinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		List<Integer> list=new ArrayList<>();		
		
		list.add(123);
		list.add(423);
		list.add(555);
		
		System.out.println(list);
		System.out.println("-------------");
		
		list.remove(2);
		System.out.println(list);
		System.out.println("-------------");
		System.out.println(list.contains(555));
		
		System.out.println("-------------");

		System.out.println(list.size());
		
		System.out.println("-------------");

		
		Object [] arr= list.toArray();
		
		for (Object d : arr)
		{
			System.out.println(d);
		}
		System.out.println("-------------");

		List<Object> list2 = Arrays.asList(arr);
		System.out.println(list2);
		
	}

}
