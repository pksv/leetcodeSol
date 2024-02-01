package com.pksv;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(new PowerOfThree().isPowerOfThree(243));
    }

    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        double x = Math.round(Math.log(n) / Math.log(3));
        System.out.println(x);
        return Math.pow(3, x) == n;
    }
}
