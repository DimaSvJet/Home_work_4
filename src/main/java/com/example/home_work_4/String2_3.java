package com.example.home_work_4;

import java.util.Scanner;

public class String2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter check word: ");
        String str2 = sc1.nextLine();

        if (str1.contains(str2)) {
            int indexStart = str1.indexOf(str2);
            if (str1.indexOf(str2,indexStart+str2.length()) > indexStart)
            {
                int indexSecond = str1.indexOf(str2,indexStart+str2.length());
                System.out.println(str1.substring(indexStart+str2.length(), indexSecond));
            }
            else {
                System.out.println("empy1");}
        } else {
             System.out.println("empty2");}}


        }
