package com.example.home_work_4;

import java.util.Scanner;

public class String1_3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter your first word: ");
        String yourWord2 = sc2.nextLine();
        System.out.println(yourWord1.trim().substring(1)+yourWord2.trim().substring(1));



    }


}
