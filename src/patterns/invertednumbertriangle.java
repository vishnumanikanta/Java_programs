package patterns;

public class invertednumbertriangle {
public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=n;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
