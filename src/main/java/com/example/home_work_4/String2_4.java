package com.example.home_work_4;

import java.util.Scanner;

public class String2_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter check the first word: ");
        String strFirst = sc1.nextLine();
        System.out.println("Enter check the second word: ");
        String strSecond = sc2.nextLine();
        int countFirst = 0;
        int indexFirstStart = 0;
        int countSecond = 0;
        int indexSecondStart = 0;
        int indexFirst;
        int indexSecond;

        if (str1.contains(strFirst) && str1.contains(strSecond)) {
            do {
                countFirst++;
                indexFirst = str1.indexOf(strFirst, indexFirstStart);
                indexFirstStart=indexFirst+strFirst.length();
                if (indexFirst < 0) continue;

                System.out.println("cat ind: "+indexFirst);
                System.out.println("cat "+countFirst);
            } while (indexFirst >= 0);
            do {
                countSecond++;
                indexSecond = str1.indexOf(strSecond, indexSecondStart);
                indexSecondStart=indexSecond+strSecond.length();
                if (indexSecond < 0) continue;
                System.out.println("dog ind: "+indexSecond);
                System.out.println("dog "+countSecond);
            } while (indexSecond >= 0);
        } else {
            System.out.println("false");
            System.exit(1);
        }
        if (countFirst == countSecond) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
