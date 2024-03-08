package com.revature.BankManagement;

public class CurrentAccount extends Accounts implements CalculateTax{
    public CurrentAccount() {
    }

    @Override
    public double calculateTax(float percentage, double balance) {
        return percentage * balance/100;
    }
    public CurrentAccount(String accountId, long balance) {
        super(accountId, balance);
    }
    @Override
    public String toString() {
        return "CurrentAccount{}";
    }
}
