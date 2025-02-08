package com.pksv.arrays;

public class CountTripletsXORArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 7};
        System.out.println(new CountTripletsXORArray().countTriplets(arr));
    }

    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            for (int j = i; j < arr.length; j++) {
                x ^= arr[j];
                if (x == 0) count += (j - i);
            }
        }
        return count;
    }
}
