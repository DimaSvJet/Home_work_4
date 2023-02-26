package com.example.home_work_4;

import java.util.Scanner;

public class String1_1 {

    public static void main(String[] args) {

        String s1 = "<<>>";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String yourWord = scanner.nextLine();
        System.out.println(s1.substring(0,2)+yourWord+s1.substring(2));



    }


}
