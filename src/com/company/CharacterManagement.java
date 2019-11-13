package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterManagement {

    static Noob createCharacter(){

        // create null object
        Noob nb = null;

        // TODO
        // todo get char attributes
        String choose;
        int choose1 = 0;
        int choose2=0;
        int choose3=0;

        try {
            System.out.println("Please choose your name :");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextLine();

            System.out.println("Please choose your damage :");
            Scanner sc1 = new Scanner(System.in);
            choose1 = sc1.nextInt();

            System.out.println("Please choose your life :");
            Scanner sc2 = new Scanner(System.in);
            choose2 = sc2.nextInt();

            System.out.println("Please choose your initiative :" );
            Scanner sc3 = new Scanner(System.in);
            choose3 = sc3.nextInt();

            nb = new Noob(choose,choose1,choose2,choose3);

        }
        catch(Exception e){
            System.out.println("Invalid choice");
        }

        // return the new Noob object or null
        return nb;

        // add char into list (??) or return noob object ?
    }

    static void addToLs(Noob createCharact, ArrayList<Noob> list){
        list.add(createCharact);
    }
}
