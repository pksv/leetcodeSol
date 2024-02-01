package com.pksv;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(new PowerOfFour().isPowerOfFour(16));
    }

    public boolean isPowerOfFour(int n) {
//        if (n <= 0) return false;
//        double x = Math.round(Math.log(n) / Math.log(4));
//        return Math.pow(4, x) == n;
        if (n < 1) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }
}
