//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoobManagement {

    public NoobManagement() {
    }


    /**
     * Function that initialize a character with players's inputs
     *
     * @return
     */
    static Noob createCharacter() {
        Noob nb = null;

        try {
            System.out.println("Please choose your name :");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            System.out.println("Please choose your damage :");
            Scanner sc1 = new Scanner(System.in);
            int choose1 = sc1.nextInt();
            System.out.println("Please choose your life :");
            Scanner sc2 = new Scanner(System.in);
            int choose2 = sc2.nextInt();
            System.out.println("Please choose your initiative :");
            Scanner sc3 = new Scanner(System.in);
            int choose3 = sc3.nextInt();
            nb = new Noob(choose, choose1, choose2, choose3);
        } catch (Exception var9) {
            System.out.println("Invalid choice");
        }

        return nb;
    }

    static void deleteNoob(ArrayList nooblist) {
        try {
            System.out.println("you have " + nooblist.size() + "character , select your delete choose");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            nooblist.remove(choose);
        } catch (Exception e) {
            System.out.println("please select only number");
        }
    }

   /* static Noob getStats(int number, ArrayList noobList, Noob character) {

        System.out.println("Select your Noob");
        Scanner sc = new Scanner(System.in);
        System.out.println(character.getName());
    }*/
}

/*



        System.out.println(choice);*/
        // System.out.println(choice + " - " + choice.getName()+" "+ choice.getLife()+" "+ choice.getDamages() +" "+ choice.getInitiative());
        //  System.out.println("character's stats");










       //static void displayNoobList (ArrayList noobList,Noob n)




