package com.pksv;

public class ReverseInteger {
    public static void main(String[] args) {
//        int x = 1534236469;
        int x = -153;
        System.out.println(new ReverseInteger().reverse(x));
    }

    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int rem = x % 10;
            res = (res * 10) + rem;
            x = x / 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
