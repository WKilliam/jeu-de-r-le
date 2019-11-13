package com.company;

import java.util.Scanner;

public class Main {

    static int test(){
        
    }


    public static void main(String[] args) {
<<<<<<< HEAD
	// write your code here
        
=======

        // write your code here

        System.out.println("+--------------------------------+");
        System.out.println("|                                |");
        System.out.println("|       FIGHT       CLUB         |");
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");

        CommandMenu.displayHelp();

        boolean continueGame = true;

        do {
            int ch = CommandMenu.getUserChoice();
            // System.out.println(ch);
           continueGame = CommandMenu.processCmd(ch);

        }
        while (continueGame == true);


        Noob t = new Noob("teddy");

<<<<<<< HEAD

>>>>>>> master
=======
       int d = t.getDamages();
        System.out.println(d);
>>>>>>> master

    }
}
