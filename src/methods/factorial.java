package methods;

import java.util.Scanner;

public class factorial {
	public static void printFactorial(int a) {
		int factorial=1;
		for(int i=a;i>=1;i--) {
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number :");
		Scanner sc=new Scanner(System.in);
		int a=sc .nextInt();
	
printFactorial(a);
	}

}
