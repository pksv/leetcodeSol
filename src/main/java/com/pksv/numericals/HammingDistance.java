package com.pksv.numericals;

public class HammingDistance {
    public static void main(String[] args) {
        int x = 297630147;
        int y = 147274294;

        System.out.println(new HammingDistance().hammingDistance(x, y));
    }

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            z = z & (z - 1);
            count++;
        }
        return count;
    }
}
