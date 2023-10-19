package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;

public class Exam{

    public HallTicket hallTicket;
    public int fees;

    /*public Exam(HallTicket hallTicket){
        this.hallTicket=hallTicket;
    }*/

    public boolean write(HallTicket hallTicket){
        boolean isAllowed =false;
        if(fees>=1200){
            System.out.println("Fees is paid ... collect the HallTicket");
            if(hallTicket != null){
                System.out.println("Iussing the hallTicket");
                this.hallTicket=hallTicket;

                this.hallTicket.displayDetails();
                System.out.println("HallTicket details are found ... proced to write exam");
                isAllowed=true;
            }else{
                System.out.println("HallTicket details are not found");
            }
        }else{
            System.out.println("Fees is not paid ");
        }
        return isAllowed;
    }

    public void write(HallTicket hallTicket,int fees){
        System.out.println("Hallticker "+fees);

    }
}

//One class depends on other class
