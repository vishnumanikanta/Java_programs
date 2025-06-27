package recursion;

import java.util.Scanner;

public class factorial {
public static int factorials(int n) {
	if(n==1||n==0) {
		return 1;
	}
	int fact_num=factorials(n-1);
	int fact=n*fact_num;
	return fact;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number to find factorial");
	int n =sc.nextInt();
	int ans=factorials(n);
	System.out.println(ans);

	}

}
