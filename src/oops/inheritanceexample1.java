package oops;

class phone {
	String brand;

	phone(String brand) {
		this.brand = brand;
	}

	void makecall(String number) {
		System.out.println(brand + " is  calling " + number);
	}

	void sms(String number, String message) {
		System.out.println("sending message to " + number + ":" + message);
	}
}

class smartphone extends phone {
	boolean beingtouched;

	smartphone(String brand, boolean beingtouched) {
		super(brand);
		this.beingtouched = beingtouched;

	}

	void browseinternet() {
		System.out.println(brand + " is browing the internet");
	}
}

public class inheritanceexample1 {

	public static void main(String[] args) {
		smartphone s = new smartphone("samsung", false);
		s.makecall("466451231351351");
		s.sms("1233546", "hello");
		s.browseinternet();
	}

}
