package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //code should be used when you need to perform multithreading and synchronization

	    Vector<String> vector=new Vector<>();
	    
	    vector.add("abc");
	    vector.add("vdhhhhh");
	    vector.add("skcfc");
	    
	    System.out.println(vector);
	    
	    Iterator<String> itr=vector.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}

}
