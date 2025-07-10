package strings;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string  ");
		String str=sc.nextLine();
		int length=0;
		
//		System.out.println("the given length of a string is "+str.length());
		for(char ch:str.toCharArray()) {
			length++;
		}
		System.out.println("the given string length is : "+length);
	}

}
