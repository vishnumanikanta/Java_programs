package arrays;

import java.util.Scanner;

public class addition_matrix {

	public static void main(String[] args) {
		

			
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the size of rows");
				int rows =sc .nextInt();
				System.out.println("enter the size of cols");
				int cols =sc .nextInt();
				int arr[][] =new int[rows][cols];
				System.out.println("enter the elements");
//				input 
				for(int i=0; i<rows;i++) {
					
					for(int j=0; j<cols;j++) {
					arr[i][j]=	sc.nextInt();
					}
				}
				
				
				System.out.println("enter the size of rows");
				int rows1 =sc .nextInt();
				System.out.println("enter the size of cols");
				int cols1 =sc .nextInt();
				System.out.println("enter the elements");	
				int arr1[][] =new int[rows][cols];
	
	for(int i=0; i<rows1;i++) {
		
		for(int j=0; j<cols1;j++) {
		arr1[i][j]=	sc.nextInt();
		}
	}
//				output
				System.out.println("2D array elements are :");
				
		for(int i=0; i<rows;i++) {
					
					for(int j=0; j<cols;j++) {
					System.out.print(arr[i][j]+ " ");
					}
					System.out.println();
				}
		for(int i=0; i<rows1;i++) {
			
			for(int j=0; j<cols1;j++) {
			System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}


			}

		

	

}
