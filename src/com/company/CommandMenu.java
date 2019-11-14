package com.company;

import java.io.IOException;
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
        System.out.println("*  3-List Characters             *");
        System.out.println("*  4-Get Characters Stats        *");
        System.out.println("*  5-Start Fight !               *");
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
     * @param choice is an integer that represents choices from user
     * @return a boolean
     */
   static  boolean processCmd(int choice, ArrayList<Noob> noobList) {
        boolean continueGame = true;


        switch (choice) {
            default:
                System.out.println("Command not supported");
                break;
            case 1:
                displayHelp();
                System.out.println(noobList);
                break;

            case 2:
                Noob character = NoobManagement.createCharacter();
                noobList.add(character);
                break;

            case 3:
                if(noobList.size()==0){
                    System.out.println("There are no Noob here");
                    displayHelp();
                }
                else {
                    for (int i = 0; i < noobList.size(); i++) {
                        character = (Noob) noobList.get(i);
                        System.out.println(i + " - " + character.getName());
                    }
                }


                break;

            case 4:
                /*
                System.out.println("Enter Noob index for stats");
                Scanner sc = new Scanner(System.in);

                    // ask the user to enter an index
                    character = noobList.get(index);
                    print(character);
                */
                break;

            case 5:

                break;

            case 6:
                if(noobList.size()==0){
                    System.out.println("There are no Noob here");
                    displayHelp();
                }
                else{
                    for (int i = 0; i < noobList.size(); i++) {
                        character = noobList.get(i);
                        System.out.println(i + " - " + character.getName());
                    }
                    NoobManagement.deleteNoob(noobList);
                }
                //Demander si l'utilisateur est sur de le supprimer. Afficher un message (pq pas une ref a Robert Paulson ??) au moment du delete.

                break;

            case 7:
                continueGame = false;
                break;

        }
        return continueGame;
    }



    }





