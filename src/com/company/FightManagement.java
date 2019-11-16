package com.company;

import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FightManagement {

    public FightManagement() {

    }


    static void launchFight(Noob fighter1, Noob fighter2) {
        //fighter1 is attacked by fighter2
        int i = 1;
        while (fighter1.getLife() > 0 && fighter2.getLife() > 0) {
            CommandMenu.myPrint("Yellow", "Round " + i);
            int damages = fighter2.getDamages();
            fighter1.hurt(damages);
            CommandMenu.myPrint("Green",fighter2.getName() + " inflicts " + damages + " to " + fighter1.getName() + " he remains " + fighter1.getLife() + " Health points");

            damages= fighter1.getDamages();
            fighter2.hurt(damages);
            CommandMenu.myPrint("Blue",fighter1.getName() + " inflicts " + damages + " to " + fighter2.getName() + " he remains " + fighter2.getLife() + " Health points");
            i++;

            System.out.println("");
        }
        if (fighter1.getLife() <= 0) {
            CommandMenu.myPrint("Red",fighter1.getName() + " has been defeated by " + fighter2.getName() + " the " + fighter2.getArchetype());
        }else{
            CommandMenu.myPrint("Red",fighter2.getName() + " has been defeated by " + fighter1.getName() + " the " + fighter1.getArchetype());

        }
    }


    static ArrayList<Noob> selectFighters(ArrayList<Noob> noobList) {
        ArrayList<Noob> fightersList = new ArrayList<Noob>();
        System.out.println("Please select a fighter :");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        Noob fighter1 = (Noob) noobList.get(choice1);
        fightersList.add(fighter1);
        System.out.println("Please select a second fighter :");
        Scanner sc1 = new Scanner(System.in);
        int choice2 = sc1.nextInt();
        Noob fighter2 = (Noob) noobList.get(choice2);
        fightersList.add(fighter2);
        return fightersList;
    }

    static void battleBegins(Noob fighter1, Noob fighter2) {

        if (fighter1.getInitiative() < fighter2.getInitiative()) {
            launchFight(fighter1, fighter2);
        } else {
            launchFight(fighter2, fighter1);
        }

    }
}


