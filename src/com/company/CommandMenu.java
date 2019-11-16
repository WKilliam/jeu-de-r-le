package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CommandMenu {


    /**
     * Function that displays the menu
     */


    static void displayHelp() {
        myPrint("Blue","**********************************");
        myPrint("Blue","*       Menu                     *");
        myPrint("Blue","*  1-Help                        *");
        myPrint("Blue","*  2-Create Character            *");
        myPrint("Blue","*  3-List Characters             *");
        myPrint("Blue","*  4-Get Characters Stats        *");
        myPrint("Blue","*  5-Start Fight !               *");
        myPrint("Blue","*  6-Delete a Character          *");
        myPrint("Blue","*  7-Quit                        *");
        myPrint("Blue","*  8-Mode Test                   *");
        myPrint("Blue","**********************************");

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
            case 1://
                displayHelp();
                System.out.println(noobList);
                break;

            case 2:
                 NoobManagement.createCharacter(noobList);
                break;

            case 3:
                 NoobManagement.displayAllCharacters(noobList);
                 break;

            case 4:
                NoobManagement.displayAllCharacters(noobList);
                NoobManagement.getStats(noobList);
                break;

            case 5:
                NoobManagement.displayAllCharacters(noobList);
                    if(noobList.size() > 0) {
                     ArrayList <Noob> fightersList = FightManagement.selectFighters(noobList);
                     FightManagement.battleBegins(fightersList.get(0),fightersList.get(1));
                        break;
                    }
                    else{
                        System.out.println("There no fighters sorry, please creates at least 2!");

                    }

            case 6:
                if(noobList.size()==0){
                    System.out.println("There are no Noob here");
                    displayHelp();
                }
                else{
                    NoobManagement.displayAllCharacters(noobList);
                    NoobManagement.deleteNoob(noobList);
                }

                //Demander si l'utilisateur est sur de le supprimer. Afficher un message (pq pas une ref a Robert Paulson ??) au moment du delete.

                break;

            case 7:
                continueGame = false;
                break;

            case 8:
                Thief voleur= new Thief("ALIBABA",50,400,45,0,100);
                Warrior guerrier = new Warrior("Conan" , 20, 500, 23, 15);
                Wizard mage = new Wizard ("Gandalf",45, 52, 23, 50);
                Noob noob = new Noob("Kevin", "noob", 23,25, 36);
                noobList.add(voleur);
                noobList.add(guerrier);
                noobList.add(mage);
                noobList.add(noob);
        }
        return continueGame;
    }

    /**
     * function that colors string
     * @param color is a string
     * @param message is a string that we want to color
     */
    static void myPrint(String color,String message){
        switch (color){
            case"Blue": System.out.println("\033[34m" + message +"\033[0m");
                break;
            case"Green": System.out.println("\033[32m" + message +"\033[0m");
                break;
            case"Red": System.out.println("\033[31m" + message +"\033[0m");
                break;
            case"Yellow": System.out.println("\033[33m" + message +"\033[0m");
                break;
            default:
                System.out.println("Error Unknown Color");
        }
    }



    }





