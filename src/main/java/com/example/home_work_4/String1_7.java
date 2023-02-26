package com.example.home_work_4;

import java.util.Scanner;

public class String1_7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter the amount of symbols: ");
        int amountSymbols = sc2.nextInt();

        if (amountSymbols > yourWord1.length()) {
            System.err.println("The amount of symbols are more then the length of word");
            System.exit(1);}
        else {
            System.out.println(yourWord1.substring(0,amountSymbols)+yourWord1.substring(yourWord1.length()
                            -amountSymbols,yourWord1.length()));

        }
        }






    }


