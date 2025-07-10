package strings;

import java.util.Scanner;

public class first_non_repeated_string {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a beatiful word :");
		String str=sc.nextLine();
		char [] str1=str.toCharArray();
		boolean isrepeated;
		for(int i=0;i<str1.length;i++) {
			isrepeated=false;
			for(int j=0;j<str1.length;j++) {
				if(i!=j && str1[i]==str1[j]) {
					isrepeated=true;
					
				}
				
			}
			if(!isrepeated) {
				System.out.println("the first occurance of a character is "+str1[i]);
				
			}
		
		}
		
	}

}
