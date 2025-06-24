package oops;

import java.util.Scanner;

interface payment {
	void pay(double amount);
}

class creditcardpayment implements payment {
	@Override
	public void pay(double amount) {
		System.out.println("amount paid: " + amount + "using credit card");
	}
}

class phonepaypayment implements payment {
	@Override
	public void pay(double amount) {
		System.out.println("amount paid: " + amount + "using phonepay");
	}
}

class gpaypayment implements payment {
	@Override
	public void pay(double amount) {
		System.out.println("amount paid: "+ amount +" using gpay");
	}
}

public class paymentsystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to pay");
		double amount = sc.nextDouble();
		int uservalue;
		do {
			displaymenu();
			System.out.println("enter a uservalue");
			uservalue = Integer.parseInt(sc.next());
			payment paymentmethod = null;
			switch (uservalue) {
			case 1:
				paymentmethod = new creditcardpayment();
				break;
			case 2:
				paymentmethod = new phonepaypayment();
				break;
			case 3:
				paymentmethod = new gpaypayment();
				break;
			default:
				System.out.println("invalid option");
				break;
			}
			paymentmethod.pay(amount);
		} while (uservalue > 0);

	}

	private static void displaymenu() {
		System.out.println("select a payment method");
		System.out.println("1.creditcard payment");
		System.out.println("2.phonepay payment");
		System.out.println("3.Gpay payment");

	}
}