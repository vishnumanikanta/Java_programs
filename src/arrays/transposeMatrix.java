package arrays;

import java.util.Scanner;

public class transposeMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of rows");
		int rows =sc .nextInt();
		System.out.println("enter the size of cols");
		int cols =sc .nextInt();
		 int[][] a = new int[rows][cols];
	        int[][] transpose= new int[cols][rows];
	      
		System.out.println("enter the elements A matrix");
//		input 
		for(int i=0; i<rows;i++) {
			
			for(int j=0; j<cols;j++) {
			a[i][j]=	sc.nextInt();
			}
		}
for(int i=0; i<rows;i++) {
			
			for(int j=0; j<cols;j++) {
			transpose[j][i]=	a[i][j];
			}
		}
	
for(int i=0; i<cols;i++) {
	
	for(int j=0; j<rows;j++) {
	System.out.print(transpose[i][j]+ " ");
	}
	System.out.println();
}


	}



	}


