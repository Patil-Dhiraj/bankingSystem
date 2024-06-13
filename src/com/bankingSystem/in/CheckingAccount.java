package com.bankingSystem.in;

public class CheckingAccount extends Account {

	private double overDraftLimit;
	
	public CheckingAccount(int accountNumber, String accountHolderName, double balance, String accountType, double overDraftLimit) {
		super(accountNumber, accountHolderName, balance, "Checking");
		// TODO Auto-generated constructor stub
		this.overDraftLimit = overDraftLimit;
	}
	
	public void checkOverDraft(double amount) {
		if(amount > balance + overDraftLimit) {
			System.out.println("Withdraw cannot proceed due to insufficient balance");
		}else {
			balance = balance - amount;
		}
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0) {
			balance = balance+amount;
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0) {
			checkOverDraft(amount);
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
