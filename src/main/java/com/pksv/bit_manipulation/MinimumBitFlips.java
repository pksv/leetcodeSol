package com.pksv.bit_manipulation;

//Minimum Bit Flips to Convert Number
public class MinimumBitFlips {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.println(new MinimumBitFlips().minBitFlips(start, goal));
    }

    public int minBitFlips(int start, int goal) {
        int flips = start ^ goal;
        int count = 0;
        while (flips > 0) {
            if (flips % 2 == 1) {
                count++;
            }
            flips /= 2;
        }
        return count;
    }
}
