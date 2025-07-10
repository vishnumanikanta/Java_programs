package strings;

import java.util.Scanner;

public class countletters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to count a letters  ");
		String str=sc.nextLine();
	
		System.out.println("enter a target ");
		char tar=sc.next().charAt(0);
		
		int count =0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==tar) {
				count++;
			}
		}
		System.out.println(" the count of the target in a string is "+count);
	}

}
