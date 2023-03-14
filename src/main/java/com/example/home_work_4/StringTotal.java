package com.example.home_work_4;

import java.util.Scanner;

public class StringTotal {

    public static void main(String[] args) {
        //String1_1
        String s1 = "<<>>";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String yourWord = scanner.nextLine();
        System.out.println(s1.substring(0,2)+yourWord+s1.substring(2));

        //String1_2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String yourWord = scanner.nextLine();
        System.out.println(yourWord.substring(0,yourWord.length()/2));

        //String1_3
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter your first word: ");
        String yourWord2 = sc2.nextLine();
        System.out.println(yourWord1.trim().substring(1)+yourWord2.trim().substring(1));

        //String1_4
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        Random random = new Random();
        boolean randomTrueFalse = random.nextBoolean();
        System.out.println(randomTrueFalse);
        if (randomTrueFalse == true) {
            System.out.println(yourWord1.trim().charAt(0));
        } else {System.out.println(yourWord1.trim().charAt(yourWord1.length()-1));}

        //String1_5
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter your second word: ");
        String yourWord2 = sc2.nextLine();
        String firstCharacter;
        String secondCharacter;
        if (yourWord1.length() != 0) {
            firstCharacter = yourWord1.valueOf(yourWord1.charAt(0));
        } else {firstCharacter = "@";}
        if (yourWord2.length() != 0) {
            secondCharacter = yourWord2.valueOf(yourWord2.charAt(0));
        } else {secondCharacter = "@";}
        System.out.println(firstCharacter + secondCharacter);

        //String1_6
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

        //String1_7
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter the amount of symbols: ");
        int amountSymbols = sc2.nextInt();

        if (amountSymbols > yourWord1.length()) {
            System.err.println("The amount of symbols are more then the length of word");
            System.exit(1);}
        else {
            System.out.println(yourWord1.substring(0,amountSymbols)+yourWord1.substring(yourWord1.length()
                    -amountSymbols,yourWord1.length()));}


        //String1_8
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter the second word: ");
        String amountSymbols = sc2.nextLine();

        if (String.valueOf(yourWord1.charAt(yourWord1.length() - 1)).equals(String.valueOf(amountSymbols.charAt(0)))) {
            System.err.println(yourWord1+amountSymbols.substring(1));}
        else System.out.println(yourWord1 + amountSymbols);

        //String1_9
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();
        System.out.print("Enter the symbol for delete: ");
        String amountSymbols = sc2.nextLine();

        if (String.valueOf(yourWord1.charAt(0)).equals(amountSymbols.toLowerCase()) ||
                String.valueOf(yourWord1.charAt(0)).equals(amountSymbols.toUpperCase())) {
            yourWord1 = yourWord1.substring(1);}
        if ((String.valueOf(yourWord1.charAt(yourWord1.length()-1)).equals(amountSymbols.toLowerCase()) ||
                (String.valueOf(yourWord1.charAt(yourWord1.length()-1)).equals(amountSymbols.toUpperCase())))) {
            yourWord1 = yourWord1.substring(0,yourWord1.length()-1);}
        System.out.println(yourWord1);

        //String1_10
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String yourWord1 = sc1.nextLine();

        System.out.println(yourWord1.substring(yourWord1.length()-2)+
                yourWord1.substring(0,yourWord1.length()-2));

        //String2_1
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str1 = scanner.nextLine();

        char findTimeChar = 'd';
        int count = 0;
        boolean flag = true;
        System.out.println("Enter your a count word: ");
        String findStr1 = sc1.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.valueOf(str1.charAt(i)).equals(String.valueOf(findTimeChar))) count++;

        } System.out.println("Times of symbol 'd' into the word are: "+count);
        count =0;
        while (flag) {
            if (str1.contains(findStr1)) {
                count++;
                str1=str1.substring(str1.indexOf(findStr1)+findStr1.length());
                if (str1.isEmpty()) flag = false;
            } else {flag = false;}
        }
        System.out.println("Times of count word are: "+count);

        //String2_2
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str1 = scanner.nextLine();

        if (str1.contains("*")) {
            int indexStar = str1.indexOf("*");
            int indexLeftOfStar = indexStar-1;
            int indexRightOfStar = indexStar+1;
            if (String.valueOf(str1.charAt(indexLeftOfStar)).equals(String.valueOf(str1.charAt(indexRightOfStar)))) {
                System.out.println("true");
            } else {
                System.out.println("false");}}
        else {
            System.out.println("false");
        }

        //String2_3
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
            System.out.println("empty2");}

        //String2_4
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


        //String2_5
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        //Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the except of the word: ");
        String exceptWord = sc1.nextLine();
        String strPlus = "";
        int indexStart = 0;
        for (int i = 0; i < str1.length(); i++) {
            strPlus = strPlus+"+";
        }
        int indexExcept = 0;

        if (str1.contains(exceptWord)) {
            while (indexExcept >= 0) {
                indexExcept = str1.indexOf(exceptWord, indexStart);
                if (indexExcept == 0) {
                    strPlus = exceptWord + strPlus.substring(exceptWord.length());
                    indexStart = exceptWord.length();
                }
                if (indexExcept > 0) {
                    strPlus = strPlus.substring(0, indexExcept)+exceptWord+strPlus.substring(indexExcept+
                            exceptWord.length());
                    indexStart = indexExcept+exceptWord.length();
                }
                if (indexExcept < 0) {
                    break;}

            }
            System.out.println(strPlus);


        } else System.out.println(strPlus);


        //String3_1
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


        //String3_2
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

        //String3_3
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