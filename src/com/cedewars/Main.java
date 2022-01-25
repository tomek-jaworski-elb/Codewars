package com.cedewars;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getMiddle("tomek"));
        System.out.println(getMiddle("mama"));
    }

    public static String getMiddle(String word) {
        String result;
        int index = (word.length() / 2);
        if (word.length() % 2 == 1) {
            result = String.copyValueOf(new char[]{word.charAt(index)});
        } else {
            result = String.copyValueOf(new char[]{word.charAt(index-1), word.charAt(index)});
        }
        return result;
    }
}
