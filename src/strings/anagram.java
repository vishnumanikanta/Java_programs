package strings;

import java.util.Arrays;
import java.util.Scanner;

import arrays.Array;

public class anagram {

	public static void main(String[] args) {
	//user input for string 1
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  string 1 :");
		String str1=sc.nextLine();
		//user input for string 2
		System.out.println("enter a  string 2:");
		String str2=sc.nextLine();
		//string is a group characters ,to convert char to string we use toCharArray methods
		char[]str=str1.toCharArray();
		char[]str3=str2.toCharArray();
		Arrays.sort(str);
		Arrays.sort(str3);
		if(Arrays.equals(str3,str)) {
			System.out.println("it is anagram" );
		}
		else {
			System.out.println("not a anagram");
		}
	}

}
