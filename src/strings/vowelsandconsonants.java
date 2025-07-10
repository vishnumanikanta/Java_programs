package strings;

import java.util.Scanner;
// without using string methods 
public class vowelsandconsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to find vowels and consonats in  string :");
		String str=sc.nextLine();
		int vowels=0;
		int consoants=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				vowels ++;
			}
			else if(ch>='a'&& ch<='z'){
				 consoants++;
			}
		}
System.out.println("total vowels in the given string is  "+ vowels);
System.out.println("total consoants in the given string is  "+ consoants);
	}

}
