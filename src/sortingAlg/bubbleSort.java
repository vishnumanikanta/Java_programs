package sortingAlg;

public class bubbleSort {

	public static void main(String[] args) {
	int a[]= {4,5,2,1};
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
	}
	for (int result : a) {
		System.out.print("sorted array using bubble sort"+result+" ");
	}
	}

}
