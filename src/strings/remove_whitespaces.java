package strings;

import java.util.Scanner;

public class remove_whitespaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to remove white spaces ");
		String str=sc.nextLine();
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);
	}
	
}
