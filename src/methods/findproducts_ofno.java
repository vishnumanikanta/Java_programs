package methods;

import java.util.Scanner;

public class findproducts_ofno {
	public static int multiple (int a ,int b) {
		int sum=a*b;
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a and b values");
		Scanner sc=new Scanner(System.in);
		int a=sc .nextInt();
		int b=sc .nextInt();
		int sum =multiple(a,b);
		System.out.println("product of two  members is "+sum);

	}

}
