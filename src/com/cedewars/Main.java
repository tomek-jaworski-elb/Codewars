package com.cedewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a,b));
    }

    public static boolean comp(int[] a, int[] b) {
        if ((a==null)||(b==null)||(a.length==0)||(b.length==0)){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int[] aa = Arrays.stream(a).map(n -> n*n).toArray();

        return Arrays.equals(aa,b);
    }

}
