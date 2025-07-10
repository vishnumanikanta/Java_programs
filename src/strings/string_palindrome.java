package strings;

import java.util.Scanner;

public class string_palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to reverse a string :");
		String str=sc.nextLine();
	
		
	String reverse = new StringBuilder(str).reverse().toString();
	System.out.println(" the reversed string is : "+reverse);
	if(reverse.equals(str)) {
		System.out.println(str +" string is palindrome ");
		
	}
	else {
		System.out.println("given string is not palindrome");
	}



	}

}
