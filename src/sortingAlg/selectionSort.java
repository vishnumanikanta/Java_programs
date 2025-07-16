package sortingAlg;

public class selectionSort {

	 public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 1};  // Step 1: Unsorted list

        for (int i = 0; i < numbers.length - 1; i++) {  // Step 2: Move position i forward
            int minIndex = i;                           // Step 3: Assume current is smallest

            for (int j = i + 1; j < numbers.length; j++) {  // Step 4: Check rest of the list
                if (numbers[j] < numbers[minIndex]) {       // Step 5: Found smaller number
                    minIndex = j;                           // Update smallest position
                }
            }

            // Step 6: Swap if needed
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        // Step 7: Print sorted numbers
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
