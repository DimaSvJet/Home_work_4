package com.example.home_work_4;

import java.util.Scanner;

public class String1_8 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter the second word: ");
        String amountSymbols = sc2.nextLine();

        if (String.valueOf(yourWord1.charAt(yourWord1.length() - 1)).equals(String.valueOf(amountSymbols.charAt(0)))) {
            System.err.println(yourWord1+amountSymbols.substring(1));}
        else System.out.println(yourWord1 + amountSymbols);

        }
    }







