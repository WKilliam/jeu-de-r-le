package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();


        CommandMenu.myPrint("Red", "+--------------------------------+");
        CommandMenu.myPrint("Red", "|                                |");
        CommandMenu.myPrint("Red", "|       FIGHT       CLUB         |");
        CommandMenu.myPrint("Red", "|                                |");
        CommandMenu.myPrint("Red", "+--------------------------------+");

        CommandMenu.displayHelp();

        boolean continueGame = true;
        ArrayList<Noob> noobList = new ArrayList<Noob>();

        do {
            int ch = CommandMenu.getUserChoice();
            // System.out.println(ch);
           continueGame = CommandMenu.processCmd(ch, noobList);

        }
        while (continueGame == true);



        Warrior romain = new Warrior("romain",100,100,100,20);

        Thief teddy = new Thief("teddy",100,100,100,23,23);

        teddy.getDamages();
        System.out.println(teddy.getDamages());
        System.out.println(teddy.getDamages());










    }
}
