package strings;

import java.util.Scanner;

public class toremoveelement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to remove white spaces ");
		String str=sc.nextLine();
		System.out.println("enter a char to deletee a letter in a string  ");
		char str1=sc.nextLine().charAt(0);
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' '&& str.charAt(i)!=str1) {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);
	
	}

}
