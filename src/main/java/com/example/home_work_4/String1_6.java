package com.example.home_work_4;

import java.util.Scanner;

public class String1_6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        String color1 = "red";
        String color2 = "blue";
        if (yourWord1.toLowerCase().substring(0,color1.length()).contains(color1) == true) {
            System.out.println(color1);
        } else {if (yourWord1.toLowerCase().substring(0,color2.length()).contains(color2) == true) {
            System.out.println(color2);
        } else {
            System.out.println("");
        } }



    }


}
