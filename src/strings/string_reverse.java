package strings;

import java.util.Scanner;

public class string_reverse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to reverse a string :");
		String str=sc.nextLine();
		
	String reverse = new StringBuilder(str).reverse().toString();
	System.out.println(" the reversed string is : "+reverse);

	}

}
