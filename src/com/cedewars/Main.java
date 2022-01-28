package com.cedewars;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));


    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i < 2) {
                result.append(numbers[i]);
            }
            if (i == 2) {
                result.append(numbers[i]).append(") ");
            }
            if ((i >= 3) && (i < 5)) {
                result.append(numbers[i]);
            }
            if (i == 5) {
                result.append(numbers[i]).append("-");
            }
            if (i>5) {
                result.append(numbers[i]);
            }
        }
        return result.toString();
    }


}
