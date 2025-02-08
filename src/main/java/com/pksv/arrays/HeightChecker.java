package com.pksv.arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}
