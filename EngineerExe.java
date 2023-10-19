package com.xworkz.engineerapp;

import com.xworkz.engineerapp.engineer.CsEngineer;
import com.xworkz.engineerapp.engineer.Engineer;
import com.xworkz.engineerapp.engineer.MarineEngineer;

public class EngineerExe {
    public static void main(String[] args) {
        Engineer engineer=new CsEngineer();
        engineer.problemSolving();

        CsEngineer csEngineer=(CsEngineer) engineer;
        csEngineer.softwareDevelopment();

     Engineer engineer2=new MarineEngineer();
        MarineEngineer marineEngineer=(MarineEngineer) engineer2;
        engineer2.problemSolving();
        marineEngineer.enjoy();
    }
}
