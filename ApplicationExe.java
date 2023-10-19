package com.google.playstoreapp;

import com.google.playstoreapp.application.Application;
import com.google.playstoreapp.hub.SoftwareHub;

import java.util.Scanner;

public class ApplicationExe {
    public static void main(String[] args) {





//
//        Application application1=new Application();
//        application1.setAppId(2);
//        application1.setAppName("Instagram");
//        application1.setAppSizeInMb(45.90);
//        application1.setCompanyName("Meta");
//        application1.setAppType("Socail Media");
//        application1.setAppVersion("1.01.1v");
//        application1.setReleseDate("09/10/2023");
//
//        Application application2=Application.builder().appId(3).appName("ola").appSizeInMb(45.36).appType("Ride-hailing app").appVersion("1.02.3v").companyName("Ani tech")
//                .releseDate("Dec-2010").build();
//
//        Application application3=Application.builder().appId(4).appName("bgmi").appSizeInMb(1000.60).appType("Game").appVersion("1.02.3v").companyName("krafton")
//                .releseDate("01-jan-2021").build();


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size=sc.nextInt();
        SoftwareHub softwareHub=new SoftwareHub(size);
        int i, p;
        for ( i=0,p=1;i<size;i++){
            Application application=new Application();
//            System.out.println("Enter App Id : ");
            application.setAppId(p++);
            System.out.println("Enter App Name : ");
            application.setAppName(sc.next());
            System.out.println("Enter App Size : ");
            application.setAppSizeInMb(sc.nextDouble());
            System.out.println("Enter App company Name : ");
            application.setCompanyName(sc.next());
            System.out.println("Enter Type of App : ");
            application.setAppType(sc.next());
            System.out.println("Enter app version : ");
            application.setAppVersion(sc.next());
            System.out.println("Enter Appa relese Date");
            application.setReleseDate(sc.next());
            softwareHub.addApplication(application);

        }

//        softwareHub.readApplication();
        String input=null;
        do {
            System.out.println("Enter 1: to read Application ");
            System.out.println("Enter 2: to get applicatio By ApplicatioName");
            System.out.println("Enter 3: to get getapplicatio By Id");
            System.out.println("Enter 3: to get applicatio By AppType");
            System.out.println("Enter 4: to get Application Name By Type");
            System.out.println("Enter 5: to get Application Type By Name");
            System.out.println("Enter 6: to get Application Size By Name");
            System.out.println("Enter 7: to get Application Compny Name By Name");
            System.out.println("Enter 8: to update Application Version by Appname");
            System.out.println("Enter 9: to update compnay Name By Id");
            System.out.println("Enter 10:to deletingapplicationByappname");

            int option= sc.nextInt();
            switch (option){
                case 1:
                    softwareHub.readApplication();
                    break;

                case 2:
                    System.out.print("Enter the application Name :");
                    Application app=softwareHub.getapplicatioByApplicatioName(sc.next());
                    System.out.println(app.getAppId() + " " + app.getAppName() + " " + app.getAppSizeInMb()
                + " " + app.getCompanyName() + " " + app.getAppType() + " " + app.getAppVersion()
                + " " + app.getReleseDate());
                    break;

                case 3:
                    System.out.print("Enter app Id :");
                    Application app3=softwareHub.getapplicatioByAppType(sc.next());
        System.out.println(app3.getAppId() + "\n" + app3.getAppName() + "\n" + app3.getAppSizeInMb()
                + "\n" +app3.getCompanyName() + "\n" + app3.getAppType() + "\n" + app3.getAppVersion()
                + "\n" + app3.getReleseDate());
                    break;

                case 4:
                    System.out.print("Enter App type :");
                    String app4=softwareHub.getApplicationNameByType(sc.next());
        System.out.println("Application name : "+app4);
                    break;

                case 5:
                    System.out.print("Enter the  app Name :");
                    String app5=softwareHub.getApplicationTypeByName(sc.next());
        System.out.println("Application type : "+app5);
                    break;

                case 6:
                    System.out.print("Enter  the app Name :");
                    double app6=softwareHub.getApplicationSizeByName(sc.next());
        System.out.println("Application Size : "+app6);

                    break;

                case 7:
                    System.out.print("Enter  the app Name :");
                    String app7=softwareHub.getApplicationCompnyNameByName(sc.next());
        System.out.println("Compnay Name : "+app7);
                    break;

                case 8:
                    System.out.print("Enter existing appname :");
                    String appname=sc.next();
                    System.out.print("Enter Updated version :");
                    String appvesion=sc.next();
                    System.out.print("Enter App Size :");
                    double appsize=sc.nextInt();
                    softwareHub.updateApplicationVersionbyAppname(appname,appvesion,appsize);
        softwareHub.readApplication();
                    break;

                case 9:
                    System.out.print("Enter App Id :");
                    int appid=sc.nextInt();
                    System.out.print("Enter updated Company Name :");
                    String updatedCompanyName=sc.next();
                    softwareHub.updatecompnayNameById(appid,updatedCompanyName);
        softwareHub.readApplication();

                    break;

                case 10:
                    System.out.print("Enter app Name :");
                    softwareHub.deletingapplicationByappname(sc.next());
                    break;

                default:
                    System.out.println("Enter valid input");
            }
            System.out.println("Enter Y/N :");
            input=sc.next();
        }while (input.equals("Y"));
        System.out.println("Thank you for using ");






//        softwareHub.addApplication(application);
//        softwareHub.addApplication(application1);
//        softwareHub.addApplication(application2);
//        softwareHub.addApplication(application3);
//        softwareHub.readApplication();
//
//
//        Application app=softwareHub.getapplicatioByApplicatioName("Instagram");
//        System.out.println(app.getAppId() + " " + app.getAppName() + " " + app.getAppSizeInMb()
//                + " " + app.getCompanyName() + " " + app.getAppType() + " " + app.getAppVersion()
//                + " " + app.getReleseDate());
////    1
//        Application app2=softwareHub.getapplicatioById(1);
//        System.out.println(app2.getAppId() + "\n" + app2.getAppName() + "\n" + app2.getAppSizeInMb()
//                + "\n" +app2.getCompanyName() + "\n" + app2.getAppType() + "\n" + app2.getAppVersion()
//                + "\n" + app2.getReleseDate());
////2
//        Application app3=softwareHub.getapplicatioByAppType("Game");
//        System.out.println(app2.getAppId() + "\n" + app3.getAppName() + "\n" + app3.getAppSizeInMb()
//                + "\n" +app3.getCompanyName() + "\n" + app3.getAppType() + "\n" + app3.getAppVersion()
//                + "\n" + app3.getReleseDate());
//
////3
//        String app4=softwareHub.getApplicationNameByType("Game");
//        System.out.println("Application name : "+app4);
//
////4
//        String app5=softwareHub.getApplicationTypeByName("bgmi");
//        System.out.println("Application type : "+app5);
//
////5
//        double app6=softwareHub.getApplicationSizeByName("bgmi");
//        System.out.println("Application Size : "+app6);
////6
//        String app7=softwareHub.getApplicationCompnyNameByName("Instagram");
//        System.out.println("Compnay Name : "+app7);
//  7
//        softwareHub.updateApplicationVersionbyAppname("Instagram","1.23.1V",40.89);
//        softwareHub.readApplication();
//  8
//        softwareHub.updatecompnayNameById(1,"Google");
//        softwareHub.readApplication();
//        softwareHub.deletingapplicationByappname("Instagram");

    }
}
