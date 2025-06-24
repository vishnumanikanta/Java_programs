package methods;

import java.util.Scanner;

public class print_Name {
	public static void Print_Name(String name) {
		System.out.println(name);
		
	
		
	}
	
	public static void main(String[] args) {
		System.out.println("enter a name");
		Scanner sc=new Scanner(System.in);
		String name =sc .next();
		Print_Name(name);
		
	}

}
