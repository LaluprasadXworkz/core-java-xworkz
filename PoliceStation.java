package com.xworkz.policedeparmentapp.station;

import com.xworkz.policedeparmentapp.officers.PoliceOfficer;

import java.util.Arrays;

public class PoliceStation {
    PoliceOfficer policeOfficers[];
    int index=0;
    int id=1;
   public PoliceStation(int size){
       policeOfficers=new PoliceOfficer[size];
    }

    public boolean addOfficers(PoliceOfficer policeOfficers){
        boolean adding=false;
        if(policeOfficers !=null){
            this.policeOfficers[index]=policeOfficers;
            this.policeOfficers[index].setOfficersId(id++);
            index++;
            System.out.println("officer added");
            adding=true;

        }
        return adding;
    }
    public void getallofficers(){
        System.out.println("Invoking getallofficers");
        for(int i=0;i<policeOfficers.length;i++){
            System.out.println(policeOfficers[i].getOfficersId()+" "+policeOfficers[i].getName()
                            +" "+policeOfficers[i].getMailId()+" "+policeOfficers[i].getPostName()
                            +""+policeOfficers[i].getAge()+""+policeOfficers[i].getGenger()+""+policeOfficers[i].getBloodGroup()
                            +""+policeOfficers[i].getAdders()
                    );
        }
    }
    public void getofficersNamebypostName(String postName){
        System.out.println("invoking getofficersNamebypostName "+postName);


        for(int i=0;i<policeOfficers.length;i++){
            if(policeOfficers[i].getPostName().equals(postName)){
                System.out.println(policeOfficers[i].getName());
            }
        }
        System.out.println("Ended of getofficersNamebypostName "+postName);
    }



    public String getaddresbyid(int id){
        System.out.println("invoking getaddresbyid "+id);
        String addres=null;
        for(int i=0;i<this.policeOfficers.length;i++){
            if(policeOfficers[i].getOfficersId()==id){
                addres=policeOfficers[i].getAdders();
                System.out.println("Addres fetched");
            }
        }
        return  addres;
    }

    public PoliceOfficer getOfficerinfobyid(int id){
        System.out.println("invoking getOfficerinfobyid "+id);
        PoliceOfficer info=null;
        for(int i=0;i<this.policeOfficers.length;i++){
            if (policeOfficers[i].getOfficersId()==id){
                info=policeOfficers[i];
                System.out.println(info.getOfficersId()+"\n"+info.getName()
                        +"\n"+info.getMailId()+"\n"+info.getPostName()
                        +"\n"+info.getAge()+"\n"+info.getGenger()+"\n"+info.getBloodGroup()
                        +"\n"+info.getAdders()
                );

            }
        }

        return  info;
    }

    public int getOfficerAgebyName(String name){
        System.out.println("Invoking getOfficerAgebyName "+name);
        int age=0;
        for(int i=0;i<this.policeOfficers.length;i++){
            if(policeOfficers[i].getName().equals(name)){
                age=policeOfficers[i].getAge();
                System.out.println("Age fetched");
            }
        }
       return age;
    }

    public String getpostNameByName(String name){
        System.out.println("invoking getpostNameByName "+name);
        String post=null;
        for (int i=0;i<this.policeOfficers.length;i++){
            if(policeOfficers[i].getName().equals(name)){
                post=policeOfficers[i].getPostName();
                System.out.println("fetching postname "+name);
            }
        }
        return  post;
    }
    public String getpostNameById(int id){
        System.out.println("invoking getpostNameById "+id);

        String post=null;
        for (int i=0;i<this.policeOfficers.length;i++){
            if(policeOfficers[i].getOfficersId()==id){
                post=policeOfficers[i].getPostName();
                System.out.println("fetching postname"+id);
            }
        }
        return  post;
    }
    public boolean updatePostNamebyOfficerName(String name,String postname){
        System.out.println("Invoking updatePostNamebyOfficerName");
        boolean update=false;
        for (int i=0;i<this.policeOfficers.length;i++){
            if(policeOfficers[i].getName().equals(name)){
                policeOfficers[i].setPostName(postname);
                System.out.println("the postname is updated");
                update=true;
            }
        }
        return update;
    }
    public void deleteOfficerById(int id){
        System.out.println("deleted ");
        int i,index;
        for(i=0,index=0;i<this.policeOfficers.length;i++){
            if(policeOfficers[i].getOfficersId()!=id){
                policeOfficers[index++]=policeOfficers[i];
            }
        }
        policeOfficers=Arrays.copyOf(policeOfficers,index);
        getnewofficerdetails(policeOfficers);

    }

    private void getnewofficerdetails(PoliceOfficer[] policeOfficers) {
        System.out.println("new Officers list");
        for(int i=0;i<policeOfficers.length;i++){
            System.out.println(policeOfficers[i].getOfficersId()+"\n"+policeOfficers[i].getName()
                    +"\n"+policeOfficers[i].getMailId()+"\n"+policeOfficers[i].getPostName()
                    +"\n"+policeOfficers[i].getAge()+"\n"+policeOfficers[i].getGenger()+"\n"+policeOfficers[i].getBloodGroup()
                    +"\n"+policeOfficers[i].getAdders()
            );
        }


    }


}
