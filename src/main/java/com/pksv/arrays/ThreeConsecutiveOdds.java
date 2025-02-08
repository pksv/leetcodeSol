package com.pksv.arrays;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {21,4,5,345,4,76,5,4,4,4,5,6,74,4};
        System.out.println(new ThreeConsecutiveOdds().threeConsecutiveOdds(arr));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
