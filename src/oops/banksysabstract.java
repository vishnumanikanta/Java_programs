package oops;

import java.util.Scanner;

//aabstarct method
abstract class bankstatement {
	protected String accountholder;
	protected double balance;

//	constructor
	public bankstatement(String accountholder, double balance) {
		this.accountholder = accountholder;
		this.balance = balance;
	}

	abstract void caluinterest();

	public void deposit(double amount) {
		balance += amount;
		System.out.println("deposited amount" + amount + "new balance " + balance);
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("insufficient balance");
		} else {
			balance -= amount;
			System.out.println("withdraw amount is :" + amount + "balance is" + balance);
		}
	}

	public void displaybalance() {
		System.out.println("account holder:" + accountholder);
		System.out.println("current balance:" + balance);
	}
}

class savingsaccount extends bankstatement {
	private double rate = 5.0;

	public savingsaccount(String accountholder, double balance) {
		super(accountholder, balance);

	}

	@Override
	void caluinterest() {
		double interest = (balance * rate) / 100;
		balance += interest;
		System.out.println("interst added :" + interest + "present balance :" + balance);
	}

}
class currentsaccount extends bankstatement {

	private double rate = 2.0;
	public currentsaccount(String accountholder, double balance) {
		super(accountholder, balance);
		// TODO Auto-generated constructor stub
	}




	

	@Override
	void caluinterest() {
		double interest = (balance * rate) / 100;
		balance += interest;
		System.out.println("interst added :" + interest + "present balance :" + balance);
	}

}
public class banksysabstract {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
savingsaccount b=new savingsaccount("nani",30000);
b.displaybalance();
b.caluinterest();
b.deposit(40000);
b.withdraw(20000);
	}
}
