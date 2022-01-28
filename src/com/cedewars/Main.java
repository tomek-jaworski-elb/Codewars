package com.cedewars;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(validParentheses("()"));


    }


    public static boolean validParentheses(String parens) {
        //Put code below
        int bracketClose = 0;
        int bracketOpen = 0;
        char[] letters = parens.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == '(') {
                bracketOpen++;
            } else if (letters[i] == ')') {
                bracketClose++;
            }
            if (bracketClose>bracketOpen) {
                return false;
            }
        }
        if (bracketClose==bracketOpen)  {
            return true;
        } else {
            return false;
        }
    }

}
