package com.revature.BankManagement;

public class AccountsManager {
    public  static void main(String[] args){
    SavingsAccount sa=new SavingsAccount("AB01",76000);
    CurrentAccount ca=new CurrentAccount("AB02",56879);
      DematAccount da=new DematAccount("AB03",67800);
    double d1=sa.calculateTax(8,sa.getBalance());
    double d2=ca.calculateTax(13,sa.getBalance());
    double d3=da.calculateTax(10,sa.getBalance());
        System.out.println("The tax for Savings Account will be "+d1);
        System.out.println("The tax for Current Account will be "+d2);
        System.out.println("The tax for Demat Account will be "+d3);
    }
}
