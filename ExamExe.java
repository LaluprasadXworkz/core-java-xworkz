package com.xworkz.examapplication;

import com.xworkz.examapplication.exam.Exam;
import com.xworkz.examapplication.exam.SupplementoryExam;
import com.xworkz.examapplication.hallticket.HallTicket;

public class ExamExe{

    public static  void main(String[] pass){
        HallTicket hallTicket=new HallTicket(456123,"20181CCE0046","My Name","Oops","OOPS-123");

//        HallTicket hallTicket2=new HallTicket(456123,"20181CCE0046","My Name","Oops","OOPS-123");

        //HallTicket hallTicket=null;
        Exam exam=new SupplementoryExam();//constrcutor insalization
        exam.fees=1500;
        //exam.fees=1300;

        exam.hallTicket=hallTicket;


        exam.write(hallTicket);
        SupplementoryExam supplementoryExam=(SupplementoryExam) exam;
       //SupplementoryExam supplementoryExam=new SupplementoryExam();
        supplementoryExam.write(hallTicket,1200);



       // exam.write();
//        SupplementoryExam supplementoryExam=new SupplementoryExam();


    }
}