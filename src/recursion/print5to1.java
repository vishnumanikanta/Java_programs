package recursion;

public class print5to1 {
	public static void printNum(int n) {
		if (n==0)
			return; // base contion
		System.out.println(n);
		printNum(n-1);//recursion call
	}
		public static void main(String[] args) {
			int n=5;
	printNum(n);	//function
	}

}
