package com.pksv.arrays;

//Check If Array Pairs Are Divisible by k
public class ArrayPairsDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        System.out.println(new ArrayPairsDivisibleByK().canArrange(arr, k));
    }

    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int i : arr) {
            freq[(i % k + k) % k]++;
        }
        if (freq[0] % 2 == 1) return false;
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }
}
