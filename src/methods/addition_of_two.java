package methods;


import java.util.Scanner;

public class addition_of_two {
	public static int sum (int a ,int b) {
		int sum=a+b;
		
		return sum;
		
	}
	public static void main(String[] args) {
		
		System.out.println("enter a and b values");
		Scanner sc=new Scanner(System.in);
		int a=sc .nextInt();
		int b=sc .nextInt();
		int sum =sum(a,b);
		System.out.println("sum of two  members is "+sum);
	}

}
