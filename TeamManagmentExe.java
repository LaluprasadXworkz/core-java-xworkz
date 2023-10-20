package org.mycompany.cricketplayermanagment;

import org.mycompany.cricketplayermanagment.playermanagment.PlayerManagment;
import org.mycompany.cricketplayermanagment.teammanagement.TeamManagement;

import java.util.Locale;
import java.util.Scanner;

public class TeamManagmentExe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the how many player You nead to add :");
        int size=sc.nextInt();

        TeamManagement teamManagement=new TeamManagement(size);

        for (int i = 0; i < size; i++) {
            PlayerManagment playerManagment=new PlayerManagment();
            System.out.print("Enter the Jersey Number :");
            playerManagment.setJerseyNo(sc.nextInt());
            System.out.print("Enter the player Name :");
            playerManagment.setName(sc.next());
            System.out.print("Enter the Role :");
            playerManagment.setRole(sc.next());
            System.out.print("Enter the age :");
            playerManagment.setAge(sc.nextInt());
            System.out.print("Enter the Date of Birth :");
            playerManagment.setDob(sc.next());
            System.out.print("Enter the Debute Date :");
            playerManagment.setDebut(sc.next());
            System.out.print("IPL Team :");
            playerManagment.setIplTeams(sc.next());
            teamManagement.addplayerdetails(playerManagment);

        }

        teamManagement.getallplayers();
    String input=null;
    do {
        System.out.println("Enter 1:To Get all players");
        System.out.println("Enter 2:To Get Player Names By Role");
//        System.out.println();
        System.out.print("Enter the choose :");
        int choose=sc.nextInt();
        switch (choose){
            case 1:
                teamManagement.getallplayers();
                break;
            case 2:
                System.out.print("Enter the player role :");
                teamManagement.getPlayerNamesByRole(sc.next());
                break;
            default:
                System.out.println("Invalid Choose");
        }
        input=sc.next().toLowerCase();
    }while (input.equals("yes"));


    }
}

