package com.example.home_work_4;

import java.util.Scanner;

public class String3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str1 = scanner.nextLine();
        int count1 = acountLastChar(str1);
        System.out.println("Total: "+(count1));
    }

    static int acountLastChar(String str1) {
        int indexChar = 2;
        int count = 0;
            while (str1.length() - indexChar > 0) {
                if (str1.charAt(indexChar-1) == str1.charAt(indexChar) &&
                        str1.charAt(indexChar-2) == str1.charAt(indexChar)) {
                    count++;
                }
                indexChar++;
                } return count;
        }

    }