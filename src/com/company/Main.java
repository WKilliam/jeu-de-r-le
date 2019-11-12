package com.company;

import java.util.Scanner;

public class Main {

    static void test_Input() {
        int i;

        Scanner keyBoard_Origin = new Scanner(System.in);

        String key_Input = keyBoard_Origin.next();

        int key_Input_INT = key_Input.length();

        int key_test = key_Input.charAt(0);


        for (i = 0; i < key_Input_INT; i = i + 1) {
            System.out.println(key_Input.charAt(i));
            if (key_test == 108) {
                System.out.println("j'ai trouvé un :" + key_Input.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
	// write your code here

    }
}
