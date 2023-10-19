package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.sbi.BankAccount;

public class SavingsAccount extends BankAccount {
    double interest=3.8;
    public SavingsAccount(){

    }
    public SavingsAccount(double deposit){
        this.credit((int) deposit);
    }
    public void  calculateInterestRate(){
        double interestAmount=(interest*getBalance())/100;
        this.credit((int) interestAmount) ;
    }
}
