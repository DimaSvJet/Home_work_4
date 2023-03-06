package com.example.home_work_4;

import java.util.Scanner;

public class String2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str1 = scanner.nextLine();

        char findTimeChar = 'd';
        int count = 0;
        boolean flag = true;
        System.out.println("Enter your a count word: ");
        String findStr1 = sc1.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.valueOf(str1.charAt(i)).equals(String.valueOf(findTimeChar))) count++;

        } System.out.println("Times of symbol 'd' into the word are: "+count);
        count =0;
        while (flag) {
            if (str1.contains(findStr1)) {
                count++;
                str1=str1.substring(str1.indexOf(findStr1)+findStr1.length());
                if (str1.isEmpty()) flag = false;
            } else {flag = false;}
        }
        System.out.println("Times of count word are: "+count);

        }
    }











