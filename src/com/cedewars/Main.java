package com.cedewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sortDesc(423));

    }
    public static int sortDesc(final int num) {
        //Your code
        int result=0;
        String tmp = Integer.toString(num);
        int [] ints = new int[tmp.length()];
        for (int i=0;i<tmp.length();i++) {
            ints[i] = Character.getNumericValue(tmp.charAt(i));
        }
        Arrays.sort(ints);
        for (int i = 0; i < ints.length / 2; i++) {
            Object temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = (int) temp;
        }
        String sss = "";
        for (int anInt : ints) {
            sss += Integer.toString(anInt);
        }
        return Integer.parseInt(sss);
    }

}
