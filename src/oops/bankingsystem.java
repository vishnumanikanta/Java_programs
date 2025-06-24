package oops;

class bankaccount {
	double balance;

	bankaccount(double balance) {
		this.balance = balance;
	}

	void calcinterest() {
		System.out.println("interest rate");
	}
}

class currentaccount extends bankaccount {

	currentaccount(double balance) {
		super(balance);

	}

	@Override
	void calcinterest() {
		double interest = balance * 0.04;
		System.out.println("interest : " + interest);
	}

}

class savingaccount extends bankaccount {

	savingaccount(double balance) {
		super(balance);

	}

	@Override
	void calcinterest() {
		double interest = balance * 0.16;
		System.out.println("saving interest : " + interest);
	}

}

public class bankingsystem {
	public static void main(String[] args) {
		bankaccount b = new currentaccount(2400.00);
		bankaccount ba = new savingaccount(24000.00);
		b.calcinterest();
		ba.calcinterest();

	}

}
