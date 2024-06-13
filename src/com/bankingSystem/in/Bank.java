package com.bankingSystem.in;

public class Bank {
	
	private Account accounts[];
	private int numberOfAccounts;
	
		public Bank(int i) {
			accounts = new Account[10];
			numberOfAccounts = 0;
		}
		
		public void addAccount(Account account) {
			if(numberOfAccounts >= accounts.length) {
				resizeArray();
			}
			accounts[numberOfAccounts++] = account;
		}
		
		public void removeAccount(int accountNumber) {
			for(int i=0; i< numberOfAccounts; i++) {
				if(accounts[i].getAccountNumber() == accountNumber) {
					accounts[i] = accounts[--numberOfAccounts];
					accounts[numberOfAccounts] = null;
					return;
				}
			}
		}
		
		public void displayAccount() {
			for(int i=0; i<numberOfAccounts; i++) {
				System.out.println(accounts[i].accountInfo());
				System.out.println();
			}
		}
		
		private void resizeArray() {
			// TODO Auto-generated method stub
			Account[] newAccounts = new Account[accounts.length * 2];
			System.arraycopy(accounts, 0, newAccounts, 0, accounts.length);
			accounts = newAccounts;
		}
	
}
