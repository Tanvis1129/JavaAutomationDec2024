package Collections;

import java.util.LinkedList;
import java.util.List;

public class linklistinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Float> list=new LinkedList<>();
		
		list.add(1.33f);
		list.add(1, 777.9f);
		list.add(2.345f);
		list.add(676.8f);
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list.get(2));     
		
	}

}
