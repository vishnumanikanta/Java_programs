package recursion;

public class print10Nnumbers {

	public static void printSum(int i ,int n, int sum ) {
		if (i==n) {
			sum+=i;
			System.out.println(sum);
			return;
			}
		sum+=i;
		System.out.println(i);
		printSum(i+1,n,sum);
	}
		public static void main(String[] args) {
			int n=1;
	printSum(1,5,0);	
	}


}
