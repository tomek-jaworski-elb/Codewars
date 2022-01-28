package com.cedewars;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 2));


    }

    public static String longestConsec(String[] strarr, int k) {
        // your code
        if ((strarr.length < k) || (k <= 0)) {
            return "";
        }
        String max = "";
        String tmp = "";
        for (int i = 0; i < strarr.length; i++) {
            tmp = strarr[i];
            for (int j = i + 1, x = 1; (j < strarr.length) && (x < k); j++, x++) {
                tmp += strarr[j];
                if (max.length() < tmp.length()) {
                    max = tmp;
                }
            }
            if (max.length() < tmp.length()) {
                max = tmp;
            }
        }
        return max;
    }

}
