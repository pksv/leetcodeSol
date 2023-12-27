package com.pksv;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 9, 9, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int[] x = new int[digits.length + 1];
        int c = 0;
        x[c++] = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println("looped");
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    for (int z : digits) {
                        x[c++] = z;
                    }
                    return x;
                }
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        return digits;
    }
}
