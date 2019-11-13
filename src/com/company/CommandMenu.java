package com.company;

import java.util.Scanner;

public class CommandMenu {
    static void displayHelp() {
        System.out.println("*************************");
        System.out.println("*       Menu            *");
        System.out.println("*  1-Help               *");
        System.out.println("*  2-Quit               *");
        System.out.println("*                       *");
        System.out.println("*                       *");
        System.out.println("*************************");

    }


    static int getUserChoice(){

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your choice : ");

        String input = key.next();

        int choice = -1;
        try {
            choice = Integer.parseInt(input);
        }
        catch(Exception e){
            System.out.println("Invalid choice");
        }

        if(choice > 2 || choice < 1){
            choice = -1;
        }
        //System.out.println(choice);

        return choice;

    }


    static boolean processCmd(int choice) {
        boolean continueGame = true;

        switch (choice) {
            case 1:
                displayHelp();
                break;

            case 2:
                continueGame = false;

            default:
                System.out.println("Command not supported");

        }
        return continueGame;
    }




}
