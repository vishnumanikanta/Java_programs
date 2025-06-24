package strings;

import java.util.Scanner;

public class String_operations {

	public static void main(String[] args) {
	
		String name ="nani";
		String name1 ="nani";
//		concat
		System.out.println(name+name1);
//		charat line by line
		for(int i=0; i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
//		compare to
		System.out.println(name.compareTo(name1)==0);
//		substring
System.out.println(name.substring(2));
	}

}
