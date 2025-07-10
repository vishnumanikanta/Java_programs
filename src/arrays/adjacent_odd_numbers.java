package arrays;

public class adjacent_odd_numbers {

	public static void main(String[] args) {
		
		int a[]= {2 ,5 ,6 ,7};
		int max_sum=0;
		for (int i=0;i<a.length-1;i++) {
			max_sum=a[i]+a[i+1];
		}

	}

}
