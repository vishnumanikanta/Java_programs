package methods;

import java.util.Scanner;

public class average_of_three {
	public static int average (int a ,int b ,int c) {
		 int sum = a + b + c;
	        return sum / 3; 
		
	}
	
	public static void main(String[] args) {
	
		System.out.println("enter a and b and c values");
		Scanner sc=new Scanner(System.in);
		int a=sc .nextInt();
		int b=sc .nextInt();
		int c=sc .nextInt();
		int sum =average(a,b,c);
		System.out.println("average of three  members is "+sum);
	}

}
