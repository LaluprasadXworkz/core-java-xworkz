package com.google.playstoreapp.hub;
import com.google.playstoreapp.application.Application;

import java.util.Arrays;



public class SoftwareHub {

    Application []application;
    int index=0;

    public SoftwareHub(int size){
        application   =new Application[size];
    }

    public boolean addApplication(Application application){
        System.out.println("Invoking addApplication");
        boolean isAddes=false;
        if(application!=null){
            this.application[index++]=application;
            isAddes=true;
        }
        return isAddes;
    }



//    public boolean checkApplication(int application.getAppId()){
//        boolean isExit=false;
//        for(int index=0;index<;index++){
//
//        }
//
//        return isExit;
//    }

    public Application getapplicatioByApplicatioName(String appName){
        System.out.println("Invoking getapplicatioByApplicatioName");
        Application appname=null;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppName().equals(appName)){
                appname=application[index];
                System.out.println("Application is found based on appliation Name");
            }
        }
        return appname;
    }

//    1
    public Application getapplicatioById(int appId){
        System.out.println("Invoking getapplicatioById");
        Application appid=null;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppId()==appId){
                appid=application[index];
                System.out.println("Application is found based on appliation ID : "+appId);
            }
        }
        return appid;
    }

//2
    public Application getapplicatioByAppType(String appType){
        System.out.println("Invoking getapplicatioByApplicatiotype");
        Application apptype=null;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppType().equals(appType)){
                apptype=application[index];
                System.out.println("Application is found based on appliation Type : "+appType);
            }
        }
        return apptype;
    }
//3
    public String getApplicationNameByType(String appType){
        System.out.println("Invoking getApplicationNameByType");
        String appname=null;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppType().equals(appType)){
                appname=application[index].getAppName();
                System.out.println("Application is found based on application Type : "+appType);
            }
        }
        return appname;
    }

//4
    public String getApplicationTypeByName(String appName){
        System.out.println("Invoking getApplicationTypeByName");
        String apptype=null;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppName().equals(appName)){
                apptype=application[index].getAppType();
                System.out.println("Application is found based on application Name : "+appName);
            }
        }
        return apptype;
    }
//5
    public double getApplicationSizeByName(String appName){
        System.out.println("Invoking getApplicationSizeByName");
        double appsize=0.0;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppName().equals(appName)){
                appsize=application[index].getAppSizeInMb();
                System.out.println("Application is found based on application Name : "+appName);
            }
        }
        return appsize;
    }

//6
    public String getApplicationCompnyNameByName(String name){
        System.out.println("Invoking getApplicationCompnyNameByTName");
        String appcompayname=null;
        for (int index = 0; index <this.application.length; index++) {
            if (application[index].getAppName().equals(name)){
                appcompayname=application[index].getCompanyName();
                System.out.println("Application is found based on application Type : "+name);
            }
        }
        return appcompayname;
    }

    public boolean updateApplicationVersionbyAppname(String appname,String appversion,double updatedsize){
        System.out.println("Invoking updateApplicationVersionbyAppname ");
        boolean updatedversion=false;
        for(int index = 0; index <this.application.length; index++){
            if(application[index].getAppName().equals(appname)){
                application[index].setAppVersion(appversion);
                application[index].setAppSizeInMb(updatedsize);
                System.out.println("App version updated and Size ");
                updatedversion=true;
            }
        }
        return updatedversion;
    }

    public boolean updatecompnayNameById(int appid,String updatedcompanyName){
        System.out.println("invoking updatecompnayNameById");
        boolean updatingcompnayName=false;
        for(int index=0;index<this.application.length;index++){
            if(application[index].getAppId()==appid){
                application[index].setCompanyName(updatedcompanyName);
                System.out.println("Application comany name is updated");
                updatingcompnayName=true;

            }
        }
        return updatingcompnayName;
    }

//    public boolean updateAppversionandSize{
//
//    }


    public void deletingapplicationByappname(String appname){

        System.out.println("Deleting application");
        int index,newindex;
        for(index=0,newindex=0;index<this.application.length;index++){
            if(!application[index].getAppName().equals(appname)){
                application[newindex++]=application[index];
                System.out.println("given app name is been deleted from the softwarehub");
            }

        }
       application= Arrays.copyOf(application,newindex);
        getallNewApplication(application);

    }

    private void getallNewApplication(Application[] application) {
        System.out.println("new application liest");
        for (int i = 0; i <application.length; i++) {
            System.out.println(application[i].getAppId() + "\n" + application[i].getAppName() + "\n" + application[i].getAppSizeInMb()
                    + "\n" + application[i].getCompanyName() + "\n" + application[i].getAppType() + "\n" + application[i].getAppVersion()
                    + "\n" + application[i].getReleseDate());

        }
    }

    public void readApplication(){
        System.out.println("Invoking ReadApplication");
            for (int i = 0; i <application.length; i++) {
                System.out.println(application[i].getAppId() + "\n" + application[i].getAppName() + "\n" + application[i].getAppSizeInMb()
                        + "\n" + application[i].getCompanyName() + "\n" + application[i].getAppType() + "\n" + application[i].getAppVersion()
                        + "\n" + application[i].getReleseDate());
                System.out.println("----------------------------------------------------------------------");
            }
    }
}
