package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        account1.deposit(100);
//        account2.deposit(100); // This line will cause a compile-time error because Valuable does not have a deposit method

        System.out.println("Account balance: " + account1.getValue());
        System.out.println("Valuable balance: " + account2.getValue());
    }
}