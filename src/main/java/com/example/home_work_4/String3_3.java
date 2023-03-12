package com.example.home_work_4;

import java.util.Scanner;

public class String3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str1 = scanner.nextLine();
        int count1 = acountLastChar(str1);
        System.out.println("Total: "+(count1));
    }

    static int acountLastChar(String str1) {
        int indexChar = 0;
        int count = 0;
        StringBuilder digital = new StringBuilder();
        while (str1.length() - indexChar > 0) {
            if (Character.isDigit(str1.charAt(indexChar))) {
                digital.append(str1.charAt(indexChar));
            }
            digital.append(" ");
            indexChar++;
        }
        digital = new StringBuilder(digital.toString().trim());
        indexChar = 0;
        int indexStart = 0;


        if (digital.toString().contains("  ")) {
            while (indexChar >= 0) {
                indexChar = digital.indexOf("  ", indexStart);
                count += Integer.parseInt(digital.substring(indexStart, indexChar).replaceAll(" ", ""));
                System.out.println(count);
                if (digital.charAt(indexChar+1) == ' ') {
                    while (digital.charAt(indexChar) == ' ') {
                        indexChar++;
                    }
                }
                indexStart = indexChar;
                indexChar = digital.indexOf("  ", indexStart);
                if (indexChar < 0) {
                    count += Integer.parseInt(digital.substring(indexStart, digital.length())
                            .replaceAll(" ", ""));
                    break;
                }
            }


        } else {
            count = Integer.parseInt(digital.toString().replaceAll(" ", ""));

        }
        return count;
    }

    }