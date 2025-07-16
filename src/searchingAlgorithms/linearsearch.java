package searchingAlgorithms;

import oops.main;

public class linearsearch {
public static void main(String[] args) {
	int a[]= {4,5,2,1};
	int target=5;
	boolean isfound=false;
	for (int i =0;i<a.length;i++) {
		if(a[i]==target) {
			  System.out.println("Found at index: " + i);
			isfound=true;
			break;
		}
		
	}
	if(!isfound) {
		System.out.println("element " + target + " not found at array");
	}
}
}
