package com.bankingSystem.in;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank(10);
		
		SavingAccount savingsAccount1 = new SavingAccount(101, "Dhiraj Patil", 1500.0, null, 5.0);
        CheckingAccount checkingAccount1 = new CheckingAccount(102, "Mangesh choube", 500.0, null, 200.0);
        
        bank.addAccount(savingsAccount1);
        bank.addAccount(checkingAccount1);

        savingsAccount1.deposit(500.0);
        checkingAccount1.withdraw(100.0);
        
        System.out.println("account info after transcation:");
        bank.displayAccount();
        
        System.out.println("Savings Account Info:");
        System.out.println(savingsAccount1.accountInfo());
        System.out.println("interest earned on Saving Account: "+savingsAccount1.calculateInterest());
        
        checkingAccount1.withdraw(700.0);
        System.out.println("account info after attempted overdraft:");
        bank.displayAccount();
        
        System.out.println("\nAll Accounts in the Bank:");
        bank.displayAccount();
        
        /*
        System.out.println("Savings Account Info:");
        System.out.println(savingsAccount1.accountInfo());
        System.out.println("Interest earned: $" + savingsAccount1.calculateInterest());

        System.out.println("\nChecking Account Info:");
        System.out.println(checkingAccount1.accountInfo());

        System.out.println("\nAll Accounts in the Bank:");
        bank.displayAccount();
		*/
		
	}

}
