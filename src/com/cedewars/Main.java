package com.cedewars;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        countPassengers(list);
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int passNumber = 0;
        for (int [] ints : stops) {
                passNumber = passNumber + ints[0] - ints[1];
        }
        return stops.stream().mapToInt(n -> n[0]-n[1]).sum();
    }

}
