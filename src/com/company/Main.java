package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

	// write your code here






        // write your code here

        System.out.println("+--------------------------------+");
        System.out.println("|                                |");
        System.out.println("|       FIGHT       CLUB         |");
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");

        CommandMenu.displayHelp();

        boolean continueGame = true;
        ArrayList<Noob> noobList = new ArrayList<Noob>();

        do {
            int ch = CommandMenu.getUserChoice();
            // System.out.println(ch);
           continueGame = CommandMenu.processCmd(ch, noobList);

        }
        while (continueGame == true);




        Noob teddy = new Noob("teddy");

/*
       int d = teddy.getDamages();
        System.out.println(teddy);


        // liste
        List<Noob> myList = new ArrayList<Noob>();
        // add
        // get
        // remove


        Noob kevin = new Noob("Kev1");
        Noob badass = new Noob("Killa", 100,1000,100);


ArrayList lol = new ArrayList();
NoobManagement.addToList(NoobManagement.createCharacter(),lol);

System.out.println(lol.get(0));

*/



    }
}
