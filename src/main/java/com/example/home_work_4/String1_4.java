package com.example.home_work_4;

import java.util.Random;
import java.util.Scanner;

public class String1_4 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        Random random = new Random();
        boolean randomTrueFalse = random.nextBoolean();
        System.out.println(randomTrueFalse);
        if (randomTrueFalse == true) {
            System.out.println(yourWord1.trim().charAt(0));
        } else {System.out.println(yourWord1.trim().charAt(yourWord1.length()-1));}



    }


}
