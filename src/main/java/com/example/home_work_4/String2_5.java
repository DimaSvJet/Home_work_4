package com.example.home_work_4;

import java.util.Scanner;

public class String2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        //Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the except of the word: ");
        String exceptWord = sc1.nextLine();
        String strPlus = "";
        int indexStart = 0;
        for (int i = 0; i < str1.length(); i++) {
            strPlus = strPlus+"+";
        }
        int indexExcept = 0;

        if (str1.contains(exceptWord)) {
            while (indexExcept >= 0) {
                   indexExcept = str1.indexOf(exceptWord, indexStart);
                if (indexExcept == 0) {
                        strPlus = exceptWord + strPlus.substring(exceptWord.length());
                        indexStart = exceptWord.length();
                    }
                if (indexExcept > 0) {
                        strPlus = strPlus.substring(0, indexExcept)+exceptWord+strPlus.substring(indexExcept+
                        exceptWord.length());
                        indexStart = indexExcept+exceptWord.length();
                    }
                if (indexExcept < 0) {
                        break;}

                }
            System.out.println(strPlus);


        } else System.out.println(strPlus);
            
        }
    }
