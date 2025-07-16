package sortingAlg;

public class insertionsort {

	public static void main(String[] args) {
		int a[]= {4,5,2,1};
		for(int i=1;i<a.length;i++) {
			  int current = a[i];     // Step 3: Pick the current number first 5, 2, 1 , 4 is already taken 
	            int j = i - 1;  //we are comparing by left element
	            while(j>=0 &&a[j]>current ) {//AND the number to the left is bigger than the card in your hand

//If both are true, shift the bigger number right.
	            	  a[j + 1] = a[j];          //  Move the bigger number one step right.
                 j--;   //Move left one step, and compare again (if needed).
//	            	  You keep checking until you find the right place for your card. 
	            }
	            a[j + 1] = current; //Now insert your card into the empty spot.
		}
	     for (int num :a) {
	            System.out.print(num + " ");
	        }
	}

}
