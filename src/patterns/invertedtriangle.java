package patterns;

public class invertedtriangle {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
