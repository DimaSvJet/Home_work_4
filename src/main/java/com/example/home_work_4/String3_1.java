package com.example.home_work_4;

import java.util.Scanner;

public class String3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the except of the word: ");
        String exceptChar1 = sc1.nextLine();
        System.out.println("Enter the except of the word: ");
        String exceptChar2 = sc2.nextLine();
        int count1 = acountLastChar(str1,exceptChar1);
        int count2 = acountLastChar(str1,exceptChar2);
        System.out.println(exceptChar1 + ": " + count1);
        System.out.println(exceptChar2 + ": " + count2);
        System.out.println("Total: "+(count1+count2));

    }

    static int acountLastChar(String str1, String exceptChar) {
        int indexChar = 0;
        int count = 0;
        if (str1.contains(exceptChar)) {
            while (indexChar >= 0) {
                indexChar = str1.indexOf(exceptChar, indexChar);

                if (indexChar < str1.length()-1){
                    if (!Character.isLetter(str1.charAt(indexChar + 1))) {

                        ++count;
                        indexChar = str1.indexOf(exceptChar, indexChar+1);
                        continue;
                } else {
                        indexChar = str1.indexOf(exceptChar, indexChar+1);
                        continue;}}
                if (indexChar == str1.length()-1) {
                    count++;
                    break;
                } break;

                } return count;
        } return 0;

    }
}