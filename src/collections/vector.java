package collections;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add("nani");
	v1.add("mani");
	v1.add(0, "hello");
	
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println(v1);
	System.out.println(v1.get(0));
	
	Vector v2=new Vector();
	v1.add("mani12");
	v1.add("hello34");
	v1.addAll(v2);
	System.out.println(v1);
	}

}
