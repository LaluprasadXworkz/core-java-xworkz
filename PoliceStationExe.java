package com.xworkz.policedeparmentapp;

import com.xworkz.policedeparmentapp.officers.PoliceOfficer;
import com.xworkz.policedeparmentapp.station.PoliceStation;

import java.util.Arrays;
import java.util.Scanner;

public class PoliceStationExe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size");
        int size=sc.nextInt();
        PoliceStation policeStation=new PoliceStation(size);
        for(int index=0;index<size;index++){
            PoliceOfficer policeOfficer=new PoliceOfficer();
//            System.out.println("Enter Officer Id : ");
//            policeOfficer.setOfficersId(sc.nextInt());
            System.out.println("Enter Officer Name : ");
            policeOfficer.setName(sc.next());
            System.out.println("Enter officer Mail Id");
            policeOfficer.setMailId(sc.next());
            System.out.println("Enter the postName : ");
            policeOfficer.setPostName(sc.next());
            System.out.println("Enter the Age : ");
            policeOfficer.setAge(sc.nextInt());
            System.out.println("Enter the Gender : ");
            policeOfficer.setGenger(sc.next());
            System.out.println("Enter the Blood Group : ");
            policeOfficer.setBloodGroup(sc.next());
            System.out.println("Enter the Addres : ");
            policeOfficer.setAdders(sc.next());
            policeStation.addOfficers(policeOfficer);
        }

        String input=null;
        do{
            System.out.println("Enter  1: to getallofficers ");
            System.out.println("Enter  2: to getOfficerinfobyid  ");
            System.out.println("Enter  3: to getaddresbyid");
            System.out.println("Enter  4: to getpostNameByName");
            System.out.println("Enter  5: to getpostNameById");
            System.out.println("Enter  6: to updatePostNamebyOfficerName");
            System.out.println("Enter  7: to getofficersNamebypostName");
            System.out.println("Enter  8: to deleteOfficerById");

            int choose= sc.nextInt();

            switch (choose){
                case 1:
                    policeStation.getallofficers();
                    break;
                case 2:
                    System.out.println("Enter Id");
                    int id=sc.nextInt();
                    policeStation.getOfficerinfobyid(id);
                    break;
                case 3:
                    System.out.println("Enter Id");
                    int id1=sc.nextInt();
                    String addres=policeStation.getaddresbyid(id1);
        System.out.println("Addres : "+addres);
                    break;
                case 4:
                    System.out.println("Enter Officer Name");
                    String name=sc.next();
                    String postName=policeStation.getpostNameByName(name);
        System.out.println("Post Name : "+postName);
                    break;
                case 5:
                    System.out.println("Enter Id");
                    int offId=sc.nextInt();
                    String postName1=policeStation.getpostNameById(offId);
        System.out.println("Post Name : "+postName1);
                    break;
                case 6:
                    System.out.println("Enter Officer Name :");
                    String name3= sc.next();
                    System.out.println("Upadate Post Name :");
                    String postN= sc.next();
                    policeStation.updatePostNamebyOfficerName(name3,postN);
                    policeStation.getallofficers();
                    break;
                case 7:
                    System.out.println("Enter Post name :");
                    String pName=sc.next();
                    policeStation.getofficersNamebypostName(pName);
                    break;
                case 8:
                    System.out.println("Enter Id");
                    int pid=sc.nextInt();
                    policeStation.deleteOfficerById(pid);
                    break;
                default:
                    System.out.println("Enter valid Input");

            }
            System.out.println("Enter Yes/No");
            input= sc.next();
        }while (input.equals("Yes"));

    }
}
