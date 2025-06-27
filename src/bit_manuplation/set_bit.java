package bit_manuplation;

public class set_bit {

	public static void main(String[] args) {
		int n=5;
		int pos=1;
		int bitMask=1<<pos; //000l left shift 2 =0100
		int newNumber=bitMask|n;
		System.out.println(newNumber);

	}

}
