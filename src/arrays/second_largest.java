package arrays;

public class second_largest {

	public static void main(String[] args) {

		int a[]= {2,3,45,87,6,788};
        int first = a[0];
        int second = -1;

        for (int i = 1; i < a.length-2; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }
		System.out.println(second);
	}

}
