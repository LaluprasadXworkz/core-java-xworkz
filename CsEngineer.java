package com.xworkz.engineerapp.engineer;

public class CsEngineer extends Engineer {
    @Override
    public void  problemSolving(){
        //super.problemSolving();
        int a=1;
        int b=2;
        System.out.println(a+b);
        super.problemSolving();
    }
    public void  softwareDevelopment(){
        System.out.println("CsEngineer Solving the problem");
    }
}
