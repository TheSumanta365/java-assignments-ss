package com.revature.BankManagement;

public abstract class Accounts{
    private String accountId;
    private static double balance;

    public  Accounts(){

    }
    public Accounts(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double deposit(double amount){
        return balance+=amount;
    }
    public  double withdraw(double amount){
        return balance-=amount;
    }

    public abstract double calculateTax(float percentage, double balance);

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                '}';
    }

}
