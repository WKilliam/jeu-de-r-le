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

        CommandMenu.displayHelp();

        boolean continueGame = true;

        do {
            int ch = CommandMenu.getUserChoice();
            // System.out.println(ch);
           continueGame = CommandMenu.processCmd(ch);

        }
        while (continueGame == true);




>>>>>>> master

    }
}
