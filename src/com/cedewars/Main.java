package com.cedewars;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)));
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 2)));

    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        if (elements.length > 0) {
            Map<Integer, Integer> map = new LinkedHashMap<>();
            int count = 0;
            for (int element : elements) {
                try {
                    if (map.get(element) <= maxOccurrences) {
                        count = map.get(element) + 1;
                    }
                } catch (NullPointerException e) {
                    count = 1;
                }
                map.put(element, count);
                count = 0;
            }
            List<Integer> integerArrays = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    integerArrays.add(entry.getKey());
                }

            }
            int[] result = new int[integerArrays.size()];
            for (int i = 0; i < integerArrays.size(); i++) {
                result[i] = integerArrays.get(i);
            }
            return result;
        } else {
            return new int[0];
        }
    }
}
