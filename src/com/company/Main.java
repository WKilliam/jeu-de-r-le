package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();


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




        Thief teddy = new Thief("teddy",100,100,100,0.5f,0.5f);

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
