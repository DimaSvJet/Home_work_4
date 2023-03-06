package com.example.home_work_4;

import java.util.Scanner;

public class String2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str1 = scanner.nextLine();

        if (str1.contains("*")) {
         int indexStar = str1.indexOf("*");
         int indexLeftOfStar = indexStar-1;
         int indexRightOfStar = indexStar+1;
         if (String.valueOf(str1.charAt(indexLeftOfStar)).equals(String.valueOf(str1.charAt(indexRightOfStar)))) {
             System.out.println("true");
        } else {
             System.out.println("false");}}
        else {
            System.out.println("false");
        }

        }
    }











