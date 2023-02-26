package com.example.home_work_4;

import java.util.Scanner;

public class String1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String yourWord = scanner.nextLine();
        System.out.println(yourWord.substring(0,yourWord.length()/2));



    }


}
