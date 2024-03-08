package com.revature.BankManagement;

public class SavingsAccount extends  Accounts implements CalculateTax{
    public SavingsAccount() {

    }

    @Override
    public double calculateTax(float percentage, double balance) {
        return percentage*balance/100;
    }


    public SavingsAccount(String accountId, long balance) {
        super(accountId, balance);
    }

        public double balanceAfterInterest(double interest)
    {
        return interest;
    }
    @Override
    public String toString() {
        return "SavingsAccount{}";
    }

    }

