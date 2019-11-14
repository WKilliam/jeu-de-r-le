package com.company;

import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FightManagement {
    /**
     * function that allows to select two characters
     * @param list where the characters are stocked
     * @return
     */
    public Object charSelection(ArrayList<Noob> list){

        try{
            System.out.println("tape un truc");
            Scanner sc = new Scanner(System.in);
            int index1 = sc.nextInt();
            Noob character1 = list.get(index1);

            System.out.println("tape un autre truc");
            int index2 = sc.nextInt();

            Noob character2 = list.get(index2);

        }
        catch (Exception e){


        }










    }
}
