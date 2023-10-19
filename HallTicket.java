package com.xworkz.examapplication.hallticket;


public class HallTicket{

    int halticketId;
    String uID;
    String candidateName;
    String subjectName;
    String subjectId;



    public HallTicket(int halticketId,String uID,String candidateName,String subjectName,String subjectId){
        this.halticketId=halticketId;
        this.uID=uID;
        this.candidateName=candidateName;
        this.subjectName=subjectName;
        this.subjectId=subjectId;
    }
    public void displayDetails(){
        //class .varible.method()->has a relation
        System.out.println("HallTicket Id : "+this.halticketId);
        System.out.println("University Id : "+this.uID);
        System.out.println("Candidate Name : "+this.candidateName);
        System.out.println("Subject Name : "+this.subjectName);
        System.out.println("Subject ID : "+this.subjectId);
    }

}