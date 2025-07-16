package arrays;

import java.util.Scanner;

public class addition_matrix {

	public static void main(String[] args) {
		

			
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the size of rows");
				int rows =sc .nextInt();
				System.out.println("enter the size of cols");
				int cols =sc .nextInt();
				 int[][] a = new int[rows][cols];
			        int[][] b = new int[rows][cols];
			        int[][] sum = new int[rows][cols];
				System.out.println("enter the elements A matrix");
//				input 
				for(int i=0; i<rows;i++) {
					
					for(int j=0; j<cols;j++) {
					a[i][j]=	sc.nextInt();
					}
				}
				System.out.println("enter the elements B matrix");
//				input 
	for(int i=0; i<rows;i++) {
					
					for(int j=0; j<cols;j++) {
					b[i][j]=	sc.nextInt();
					}
				}
	System.out.println("sum of a and b matrix :");
	  for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              sum[i][j] = a[i][j] * b[i][j];
          }
      }
				
			
		for(int i=0; i<rows;i++) {
			
			for(int j=0; j<cols;j++) {
			System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}


			}

		

	

}
