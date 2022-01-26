package com.cedewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
    }

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            String tmp = str.substring(i + 1);
            if (tmp.indexOf(str.charAt(i)) != -1) {
                return false;
            }
        }
        return true;
    }

}
