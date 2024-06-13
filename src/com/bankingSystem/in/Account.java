package com.bankingSystem.in;

abstract class Account {
	
	private int accountNumber;
	private String accountHolderName;
	protected double balance;
	private String accountType;
	
	public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public abstract String accountInfo();

	

}
