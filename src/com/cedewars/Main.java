package com.cedewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str1 = "bcdefh";
        System.out.println(findMissingLetter(str1.toCharArray()));
        String str2 = "EFGIJK";
        System.out.println(findMissingLetter(str2.toCharArray()));

    }

    public static char findMissingLetter(char[] array) {
        String abcdBig = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        String abcdSmall = abcdBig.toLowerCase();
        boolean isSmall;
        int lengthOfArray = array.length;
        String s = Character.toString(array[0]);
        isSmall = s.equals(s.toLowerCase());
        if (isSmall) {
            int indexOf = abcdSmall.indexOf(array[0]);
            String tmp = abcdSmall.substring(indexOf, indexOf + lengthOfArray + 1);
            for (int i = 0; i < lengthOfArray; i++) {
                if (tmp.charAt(i) != array[i]) {
                    return tmp.charAt(i);
                }
            }
        } else {
            int indexOf = abcdBig.indexOf(array[0]);
            String tmp = abcdBig.substring(indexOf, indexOf + lengthOfArray + 1);
            for (int i = 0; i < lengthOfArray; i++) {
                if (tmp.charAt(i) != array[i]) {
                    return tmp.charAt(i);
                }
            }
        }
        return ' ';
    }
}
