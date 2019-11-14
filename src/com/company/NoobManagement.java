//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoobManagement {

    public NoobManagement() {
    }


    /**
     * Function that initialize a default character with players's inputs
     *
     * @return an object. Contains the name, health points, damages and initiative's character.
     */
    static void createCharacter(ArrayList noobList) {

        try {
            System.out.println("Please choose your name :");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            System.out.println("Please choose your archetype : 1 -> Warrior / 2 -> Wizard / 3 -> Thief");
            Scanner sc4 = new Scanner(System.in);
            int archetypeNumber = sc4.nextInt();


            System.out.println("Please choose your damage :");
            Scanner sc1 = new Scanner(System.in);
            int damage = sc1.nextInt();

            System.out.println("Please choose your life :");
            Scanner sc2 = new Scanner(System.in);
            int life = sc2.nextInt();

            System.out.println("Please choose your initiative :");
            Scanner sc3 = new Scanner(System.in);
            int initiative = sc3.nextInt();

            switch (archetypeNumber) {
                default:
                    System.out.println("What?");
                    break;
                case 1:
                    Warrior war1 =  new Warrior (name, damage, life, initiative,23);
                     noobList.add(war1);
                     break;

                case 2:
                    Wizard wiz1 =  new Wizard(name, damage, life, initiative);
                    noobList.add(wiz1);
                    break;

                case 3:
                    Thief thief1 =  new Thief (name, damage, life, initiative,23,34);
                    noobList.add(thief1);
                    break;

            }

        } catch (Exception var9) {
            System.out.println("Invalid choice");
        }
    }

    /**
     * Function that makes delete a character. When user want to delete, he needs to enter the index of character.
     *
     * @param nooblist
     */
    static void deleteNoob(ArrayList nooblist) {
        try {
            System.out.println("Select number of character you want to delete :");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("Are you sure ? Y/N");
            Scanner sc1 = new Scanner(System.in);
            String choice1 = sc1.next();
            if (choice1.equals("Y") == true) {
               Noob noob = (Noob) nooblist.get(choice);
                System.out.println("His name was " + noob.getName() + " , he was the best " + noob.getArchetype() + " ever, rest in peace Bro, TT");
                nooblist.remove(choice);


            }
        } catch (Exception e) {
            System.out.println("Haha, lucky boy, his hour is not arrived yet!");
        }
    }

    static void displayAllCharacters(ArrayList noobList) {
        if (noobList.size() == 0) {
            System.out.println("There are no Noob here");
        } else {
            for (int i = 0; i < noobList.size(); i++) {
                Noob character = (Noob)noobList.get(i);
                System.out.println(i + " - " + character.getName());
            }
        }
    }

    static void getStats(ArrayList noobList) {

        System.out.println("Select your Noob");
        Scanner sc = new Scanner(System.in);
        int noobIdx = sc.nextInt();
        Noob noob = (Noob)noobList.get(noobIdx);
        System.out.println(noob.toString());
    }
}

/*



        System.out.println(choice);*/
        // System.out.println(choice + " - " + choice.getName()+" "+ choice.getLife()+" "+ choice.getDamages() +" "+ choice.getInitiative());
        //  System.out.println("character's stats");










       //static void displayNoobList (ArrayList noobList,Noob n)




