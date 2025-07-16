package arrays;

public class second_largest {

    public static void main(String[] args) {

        int a[] = {2, 3, 45, 87, 6,98, 788};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + second);
        }
    }
}