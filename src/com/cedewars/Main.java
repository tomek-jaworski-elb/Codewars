package com.cedewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s = "abcdef";
        String s1 = "HelloWorld";
        String s2 = "LovePizza";
        System.out.println(Arrays.toString(solution(s)));
        System.out.println(Arrays.toString(solution(s1)));
        System.out.println(Arrays.toString(solution(s2)));

    }

    public static String[] solution(String s) {
        //Write your code here
        String[] result = null;
        if (s.length() % 2 == 0) {
            result = new String[s.length() / 2];
        } else {
            result = new String[(s.length() / 2) + 1];
        }
        for (int i = 0; i < s.length(); i = i + 2) {
            try {
                result[i / 2] = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1));
            } catch (IndexOutOfBoundsException e) {
                result[i / 2] = Character.toString(s.charAt(i)) + Character.toString('_');
            }
        }
        return result;
    }
}
