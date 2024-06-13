package com.bankingSystem.in;

public class SavingAccount extends Account {
	
	private double interestRate;
	
	public SavingAccount(int accountNumber, String accountHolderName, double balance, String accountType, double interestRate) {
		super(accountNumber, accountHolderName, balance, "Savings");
		// TODO Auto-generated constructor stub
	}
	
	public double calculateInterest() {
		double interest =  balance * interestRate;
		return interest;	
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance = balance + amount;
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Sorry, Insufficient balance.");
		}
	}

	@Override
	public String accountInfo() {
		// TODO Auto-generated method stub
		return "Account Number: "+getAccountNumber() +
				"\nAccount Holder: "+getAccountHolderName() +
				"\nAccount Type: "+getAccountType() +
				"\nBalance: "+balance;
	}	

}


