package com.example.home_work_4;

import java.util.Scanner;

public class String1_10 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();

        System.out.println(yourWord1.substring(yourWord1.length()-2)+
                yourWord1.substring(0,yourWord1.length()-2));


        }
    }







