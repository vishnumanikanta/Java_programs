package arrays;

import java.util.Scanner;

public class array_element_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc .nextInt();
		int arr[] =new int[n];
	System.out.println("enter elements");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		 System.out.println("Enter the value to search:");
		int val=sc.nextInt();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==val) {
			System.out.println("array elemnts found at index:" +i);
			}
			else {
				System.out.println("element not found");
			}

		}
		
	}

}
