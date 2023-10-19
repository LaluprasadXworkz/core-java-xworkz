package com.xworkz.yono.sbi;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void debit(int amount){
        if(balance>=amount){
            balance-=amount;
           // System.out.println("---------------");
            //System.out.println("My Avalable in my main bank Balance : "+balance);

        }
    }
    public void credit(int amount){
        balance+=amount;
        //System.out.println("Creadited amount : "+amount);
        //System.out.println("Bank balance : "+balance);
    }
    public void transfer(int amount,BankAccount beneficiarAccount){
        this.debit(amount);
        beneficiarAccount.credit(amount);

    }


}
