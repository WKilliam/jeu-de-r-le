package com.company;

import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FightManagement {
/*
    static void launchAttack(Noob fighter1, Noob fighter2) {
        //fighter1 is attacked by fighter2
        fighter1.hurt(fighter2.getDamages());
        System.out.println(fighter1.getLife());
    }
*/

    /**
     * THIS FUNCTION USES TWO LIST FOR CREATE A FIGHT ZONE
     * TAKES TWO NOOB OBJECTS IN THE NOOBLIST AND PLACES CHOICE OF PLAYER IN THE FIGHT_CLUB
     * @param nooblist LIST OF STORE BASE OBJECTS
     * @param fight_CLUB LIST USED FOR STORE TWO FIGHTERS FOR FIGHT
     */

    static void select_character_for_fight(ArrayList nooblist, ArrayList<Noob> fight_CLUB) {
        try {
            int i;
            for (i = 0; i < 2; i = i + 1) {
                NoobManagement.displayAllCharacters(nooblist);
                System.out.println("choose character for the fight : ");
                Scanner sc = new Scanner(System.in);
                int index1 = sc.nextInt();
                fight_CLUB.add((Noob) nooblist.get(index1));
            }
        } catch (Exception e) {
            System.out.println("your choose is not good ");
        }
    }

    /**
     * FUNCTION TAKE THE LIST FOR CHOOSE THE NOOB OBJECT WITH MORE INITIATIVE
     * @param list THIS LIST IS THE FIGHT CLUB OF THE FIGHTER
     */

    static void fight_turn_OF_INITIATIVE(ArrayList<Noob> list) {
        int coin = (int) (Math.random() * 1);
        Noob chr1 = list.get(0);
        Noob chr2 = list.get(1);
        int chr11 = chr1.getInitiative();
        int chr12 = chr2.getInitiative();
        if (chr11 < chr12) {
            list.add(chr2);
            list.add(chr1);
            list.remove(0);
            list.remove(1);
        }
        if (chr11 == chr12) {
            if (coin == 0) {
                list.add(chr2);
                list.add(chr1);
                list.remove(0);
                list.remove(1);
            } else {
                list.add(chr1);
                list.add(chr2);
                list.remove(0);
                list.remove(1);
            }
        }
    }

    /**
     * FIGHT_CLUB FUNCTION IT'S THE VIP CLUB FOR FIGHTER NOOB OBJECT
     * HE TAKE TWO NOOB OBJECT FOR THE FIGHT STAGE
     * @param player1 THIS IS OBJECT NOOB USED FOR FIGHT
     * @param player2 THIS IS OBJECT NOOB USED FOR FIGHT
     */

    static void fight_club(Noob player1, Noob player2) {
        int i=0;

        while (player1.getLife() > 0 && player2.getLife() > 0) {

            int dmg = player1.getDamages();
            int dmg1 = player2.getDamages();
            player2.hurt(dmg1);
            if ((player2.getLife() - dmg1) <= 0) {
                CommandMenu.myPrint("Yellow",player1.getName() + "hits" + " has killed " + player2.getName());
                System.out.println(player1);
                break;
            } else {

                System.out.println("Round : "+ i++);
                System.out.println(player1.getName() + " hits " + dmg + "  " + player2.getName() + " " + player2.getLife());
            }
            player1.hurt(dmg);
            if ((player1.getLife() - dmg1) <= 0) {
                CommandMenu.myPrint("Yellow",player2.getName() +"hits" + dmg +" and has killed " + player1.getName());
                System.out.println(player1);
                break;
            } else {

                System.out.println("Round : "+ i++);
                System.out.println(player2.getName() + " inflict " + dmg1 + " to " + player1.getName() + " remains  " + player1.getLife()+ " Health point");
            }
        }
    }
}

