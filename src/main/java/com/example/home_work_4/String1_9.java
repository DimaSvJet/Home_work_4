package com.example.home_work_4;

import java.util.Scanner;

public class String1_9 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter the symbol for delete: ");
        String amountSymbols = sc2.nextLine();

        if (String.valueOf(yourWord1.charAt(0)).equals(amountSymbols.toLowerCase()) ||
                String.valueOf(yourWord1.charAt(0)).equals(amountSymbols.toUpperCase())) {
            yourWord1 = yourWord1.substring(1);}
        if ((String.valueOf(yourWord1.charAt(yourWord1.length()-1)).equals(amountSymbols.toLowerCase()) ||
                (String.valueOf(yourWord1.charAt(yourWord1.length()-1)).equals(amountSymbols.toUpperCase())))) {
            yourWord1 = yourWord1.substring(0,yourWord1.length()-1);}
       System.out.println(yourWord1);

        }
    }







