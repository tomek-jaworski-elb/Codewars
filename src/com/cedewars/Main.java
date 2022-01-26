package com.cedewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }

    public static boolean check(String sentence) {
        String abc = "abcdefghijklmnopqrstuwxyz";
        sentence = sentence.toLowerCase();
        for (int i = 0; i < abc.length(); i++) {
            if (sentence.indexOf(abc.charAt(i))==-1) {
                return false;
            }
        }
        return true;
    }
}
