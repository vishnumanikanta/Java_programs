package searchingAlgorithms;

public class binarySearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int target=5;
		int left =0;
		int right =a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(a[mid]==target) {
				 System.out.println("Found at index: " + mid);
				 return;
			}
			else if(a[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println("not found element");
	}

}
