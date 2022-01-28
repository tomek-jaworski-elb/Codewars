package com.cedewars;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 2));
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
        System.out.println(longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
        System.out.println(longestConsec(new String[]{}, 3));

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
