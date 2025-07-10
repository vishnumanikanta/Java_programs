package strings;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string 1 ");
		String str1=sc.nextLine();
		System.out.println("enter a string 2");
		String str2=sc.nextLine();
		if(str1.contains(str2)) {
			System.out.println(str1+" contains "+str2);
		}
		else {
			System.out.println(str1+" doesnot contains "+str2);
		}
	}

}
