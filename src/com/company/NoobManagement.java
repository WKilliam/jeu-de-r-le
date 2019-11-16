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
        String archetype = "Noob";

        try {
            System.out.println("Please choose your name :");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            System.out.println("Please choose your archetype : 1 -> Warrior / 2 -> Wizard / 3 -> Thief 4 -> Noob");
            Scanner sc4 = new Scanner(System.in);
            int archetypeNumber = sc4.nextInt();

            if(archetypeNumber <= 0 || archetypeNumber >= 5){
                throw new Exception("bad archetype value");
            }


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
                    System.out.println("Please choose the value of your shield :");
                    Scanner sh = new Scanner (System.in);
                    int shield = sh.nextInt();
                    Warrior war1 =  new Warrior (name, damage, life, initiative,shield);
                    noobList.add(war1);
                    break;

                case 2:
                    System.out.println("Please choose your magic's Damages :");
                    Scanner md = new Scanner (System.in);
                    int magicDamages= md.nextInt();
                    Wizard wiz1 =  new Wizard(name,damage,life,initiative,magicDamages);
                    noobList.add(wiz1);
                    break;

                case 3:
                    System.out.println("Please choose your dodge's probability :");
                    Scanner d = new Scanner (System.in);
                    int dodge = d.nextInt();
                    System.out.println("Please choose your critical's probability");
                    Scanner c = new Scanner(System.in);
                    int critical = c.nextInt();
                    Thief thief1 =  new Thief (name, damage, life, initiative,dodge,critical);
                    noobList.add(thief1);
                    break;

                case 4:
                    Noob noob1 = new Noob(name,archetype,damage, life,initiative);
                    noobList.add(noob1);
                    break;


            }

        } catch (Exception var9) {
            System.out.println("Invalid choice");
        }
    }

    /**
     * Function that makes delete a character. When user want to delete, he needs to enter the index of character.
     *
     * @param nooblist is the Arraylist which store characters
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

    /**
     * Function that displays all the character of the list
     * @param noobList is the Arraylist which store characters
     */

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






