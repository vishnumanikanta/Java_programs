package arrays;

import java.util.Scanner;

public class searchelementin2Darray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of rows");
		int rows =sc .nextInt();
		System.out.println("enter the size of cols");
		int cols =sc .nextInt();
		int arr[][] =new int[rows][cols];
		System.out.println("enter the elements");
//		input 
		for(int i=0; i<rows;i++) {
			
			for(int j=0; j<cols;j++) {
			arr[i][j]=	sc.nextInt();
			}
		}
//		output
		System.out.println("enter a value to find  :");
		
		int val =sc .nextInt();
for(int i=0; i<rows;i++) {
			
			for(int j=0; j<cols;j++) {
		if(arr[i][j]==val) {
			System.out.println("element found at index :"+" (" + i +"," + j + ")");
		}
			}
			System.out.println();
		}

	}

}
