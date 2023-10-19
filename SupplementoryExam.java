package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;

public class SupplementoryExam extends Exam{

    public int noOfAtempors=2;

    @Override
    public boolean write(HallTicket hallTicket){
        if(noOfAtempors>1){
            System.out.println("Supplementory Exam ");
            return super.write(hallTicket);
        }

        return false;
    }

   public void write(HallTicket hallTicket,int fees){
       System.out.println(fees);
       // return super.write(hallTicket,1500);

   }

}
