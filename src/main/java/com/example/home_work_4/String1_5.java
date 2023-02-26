package com.example.home_work_4;

import java.util.Random;
import java.util.Scanner;

public class String1_5 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter your second word: ");
        String yourWord2 = sc2.nextLine();
        String firstCharacter;
        String secondCharacter;
        if (yourWord1.length() != 0) {
            firstCharacter = yourWord1.valueOf(yourWord1.charAt(0));
        } else {firstCharacter = "@";}
        if (yourWord2.length() != 0) {
            secondCharacter = yourWord2.valueOf(yourWord2.charAt(0));
        } else {secondCharacter = "@";}
        System.out.println(firstCharacter + secondCharacter);



    }


}
