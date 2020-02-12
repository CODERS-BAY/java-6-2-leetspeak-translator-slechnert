package com.codersbay;

import java.util.Scanner;

public class LeetspeakTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char normal[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
        char l33t[] = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2', ' '};

        System.out.println("Please enter your favourite quote:");
        String input = sc.nextLine();
        String preLeet = input.toUpperCase();
        String trv3L33t = "";

        for (int i = 0; i < preLeet.length(); i++) {


            char tmp = preLeet.charAt(i);
            for (int j = 0; j < normal.length; j++) {
                if (tmp == normal[j]) {
                    trv3L33t += l33t[j];
                }
            }
        }
        System.out.println(trv3L33t);
    }


}
