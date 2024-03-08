package com.revature.BankManagement;

public class DematAccount extends  Accounts {
    public DematAccount() {
    }

    public DematAccount(String accountId, long balance) {
        super(accountId, balance);
    }

    @Override
    public String toString() {
        return "DematAccount{}";
    }

    @Override
    public double calculateTax(float percentage, double balance) {
        return percentage * balance / 100;
    }
}
