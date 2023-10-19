package com.xworkz.yono;

import com.xworkz.yono.sbi.BankAccount;
import com.xworkz.yono.sbi.current.CurrentAccount;
import com.xworkz.yono.sbi.savings.SavingsAccount;

public class BankAccountExe {
    public static void main(String[] args) {


        BankAccount account=new SavingsAccount(15000);
        account.credit(25000);
        account.credit(25000);


        SavingsAccount mysavingsAccount= (SavingsAccount) account;
        mysavingsAccount.calculateInterestRate();
        System.out.println("Balance after interest rate : "+mysavingsAccount.getBalance());
        System.out.println("Available Banalance "+account.getBalance());

        BankAccount account1=new SavingsAccount(5000);

        SavingsAccount mysavingsAccount1= (SavingsAccount) account1;
        mysavingsAccount1.calculateInterestRate();
        System.out.println("Balance after interest rate : "+mysavingsAccount1.getBalance());
        System.out.println("Available Banalance "+account1.getBalance());


//
//        SavingsAccount fees=new SavingsAccount();
//        account.transfer(1000,fees);
//
//        System.out.println("Fees payed : "+fees.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        SavingsAccount xworkzfees=new SavingsAccount();
//        account.transfer(15000,xworkzfees);
//        System.out.println("xworkz Fees payed : "+xworkzfees.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        CurrentAccount hotel=new CurrentAccount();
//        account.transfer(100,hotel);
//        System.out.println("Bill payed : "+hotel.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        SavingsAccount pgrent=new SavingsAccount();
//        account.transfer(6000,pgrent);
//        System.out.println("Pg rent : "+pgrent.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        CurrentAccount laptopBattery=new CurrentAccount();
//        account.transfer(3000,laptopBattery);
//        System.out.println("laptop Battery Bill payed : "+laptopBattery.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        CurrentAccount medicalShope=new CurrentAccount();
//        account.transfer(130,medicalShope);
//        System.out.println("Medical Shope Bill payed : "+medicalShope.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        SavingsAccount buspass=new SavingsAccount();
//        account.transfer(1200,buspass);
//        System.out.println("Buspass Bill : "+buspass.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        BankAccount pendrive=new CurrentAccount();
//        account.transfer(499,pendrive);
//        System.out.println("pendrive price : "+pendrive.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());
//
//        BankAccount headset=new CurrentAccount();
//        account.transfer(1300,headset);
//        System.out.println("Headset price : "+headset.getBalance());
//        System.out.println("My balance after transfer : "+account.getBalance());

    }
}
