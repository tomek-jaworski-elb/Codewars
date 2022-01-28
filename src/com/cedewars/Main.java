package com.cedewars;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));

    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int odd = 0;
        for (int i : a) {
            int val=0;
            try {
                val= map.get(i);
            } catch (NullPointerException e) {
                map.put(i,1);
            }
            map.put(i,val+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()%2==1) {
                return entry.getKey();
            }
        }
        return odd;
    }

}
