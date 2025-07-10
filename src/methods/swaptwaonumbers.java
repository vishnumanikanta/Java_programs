package methods;

public class swaptwaonumbers {

	public static void swapnum(int m , int n){
//     	int temp=m;
//		m=n;
//		n=temp;

//opitinal
//m=m^n;
//n=m^n;
//m=m^n;
m=m+n;
n=m-n;
m=m-n;

	System.out.println("m value :" + m);
		System.out.println("n value :" + n);
}
public static void main(String[] args) {
	int m=2;
	int n=3;
swapnum(m,n);
}

}
