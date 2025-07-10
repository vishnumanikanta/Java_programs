package strings;

public class reverse_string_efficient {

	public static void main(String[] args) {



		        String s = "madam";
		        char[] c = s.toCharArray();
		        int left = 0;
		        int right = c.length - 1;

		        while (left < right) {
		            char temp = c[left];
		            c[left] = c[right];
		            c[right] = temp;

		            left++;
		            right--;
		        }

		        String reverse =new String(c);  
		    if(reverse.equals(s)) {
		    	System.out.println(s+" it is a palindrome");
		    }
		}

}
