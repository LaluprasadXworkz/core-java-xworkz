package org.mycompany.cricketplayermanagment.teammanagement;
import org.mycompany.cricketplayermanagment.playermanagment.PlayerManagment;

public class TeamManagement {
    PlayerManagment playerDetails[];
    int index;

    public TeamManagement(int size){
        playerDetails=new PlayerManagment[size];
    }

    public boolean addplayerdetails(PlayerManagment playerDetails){
        boolean isAdd=false;
        if(playerDetails!=null){
            this.playerDetails[index++]=playerDetails;
            isAdd=true;
        }

        return isAdd;
    }

    public void getPlayerNamesByRole(String role) {
        System.out.println("Player names for the role '" + role + "':");
        for (index = 0; index < playerDetails.length; index++) {
            if (playerDetails[index].getRole().equals(role)) {
                System.out.println(playerDetails[index].getName());
            }
        }
    }

    public void getallplayers(){
        for(index=0;index<playerDetails.length;index++){
            System.out.println("Player jersey number : "+playerDetails[index].getJerseyNo()+"\nPlayer Name : "+playerDetails[index].getName()
                            +"\nPlayer Role : "+playerDetails[index].getRole()+"\nPlayer Age : "+playerDetails[index].getAge()+"\nDate of birth"+playerDetails[index].getDob()
                            +"\n Debut Date : "+playerDetails[index].getDebut()+"\nIPL Teams : "+playerDetails[index].getIplTeams()
                    );
            System.out.println("-----------------------------------------------------------------------");
        }

    }


}
