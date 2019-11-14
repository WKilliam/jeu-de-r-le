package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandMenu {
    /**
     * Function that displays the menu
     */


    static void displayHelp() {
        System.out.println("**********************************");
        System.out.println("*       Menu                     *");
        System.out.println("*  1-Help                        *");
        System.out.println("*  2-Create Character            *");
        System.out.println("*  3-Characters List             *");
        System.out.println("*  4-Characters Stats            *");
        System.out.println("*  5-Fight !                     *");
        System.out.println("*  6-Delete a Character          *");
        System.out.println("*  7-Quit                        *");
        System.out.println("**********************************");

    }

    /**
     * Functions that takes players's input and convert into an integer
     * @return an integer
     */
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

        if(choice > 7 || choice < 1){
            choice = -1;
        }
        //System.out.println(choice);

        return choice;

    }

    /**
     * Functions that process the choice of the user
     * @param choice is a integer that represents the choice of the user
     * @return a boolean
     */
    static boolean processCmd(int choice) {
        boolean continueGame = true;

        switch (choice) {
            default:
                System.out.println("Command not supported");
                // no break
            case 1:
                displayHelp();
                break;

            case 2:
                createCharacter();
                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:
                continueGame = false;
                break;

        }
        return continueGame;
    }

    static void createCharacter(){
        // TODO
        // todo get char attributes
        Noob nb = new Noob("Noob1");

        // add char into list (??) or return noob object ?

    }




}
