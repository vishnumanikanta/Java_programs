package arrays;

import java.util.Scanner;

public class rowandcolumnsum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of rows");
		int rows =sc .nextInt();
		System.out.println("enter the size of cols");
		int cols =sc .nextInt();
		 int[][] a = new int[rows][cols];
	       
	      
		System.out.println("enter the elements A matrix");
//		input 
		for(int i=0; i<rows;i++) {
			
			for(int j=0; j<cols;j++) {
			a[i][j]=	sc.nextInt();
			}
		}

	
for(int i=0; i<rows;i++) {
	int rowsum=0;
	for(int j=0; j<cols;j++) {
	rowsum+=a[i][j];
	}
	 System.out.println("Sum of row " + (i + 1) + ": " + rowsum);
}
for(int j=0; j<rows;j++) {
	int colsum=0;
	for(int i=0; i<cols;i++) {
colsum+=a[i][j];
	}
	 System.out.println("Sum of Column " + (j + 1) + ": " + colsum);
}


	}



	}


