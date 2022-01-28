package com.cedewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        pigIt("Pig latin is cool");
        System.out.println("\n");
        pigIt("This is my string");
    }

    public static String pigIt(String str) {
        // Write code here

        String[] sliptedString = str.split(" ");
        List<String> strings = new ArrayList<>(Arrays.asList(sliptedString));
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, shiftLeft(strings.get(i).toCharArray()) + "yl");
        }
        for (String s : strings) {
            System.out.println(s);
        }

        return null;
    }

    public static String shiftRight(char[] letters) {

        char last = letters[letters.length - 1];          // save off first element

        // shift right
        for (int index = letters.length - 2; index >= 0; index--)
            letters[index + 1] = letters[index];

        // wrap last element into first slot
        letters[0] = last;
        return Arrays.toString(letters);
    }

    public static String shiftLeft(char[] letters) {
        int shiftBy = letters.length - 1;

        for (int i = 0; i < shiftBy; i++) {
            for (int j = letters.length - 1; j > 0; j--) {
                char temp = letters[j];
                letters[j] = letters[j - 1];
                letters[j - 1] = temp;
            }
        }

        return String.valueOf(letters);
    }

}
