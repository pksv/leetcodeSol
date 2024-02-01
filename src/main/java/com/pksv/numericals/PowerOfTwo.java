package com.pksv.numericals;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(64));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
//        var x = Math.round((Math.log(n) - Math.log(2)) / Math.log(2)) + 1;
        double x = Math.log(n) / Math.log(2);
        System.out.println(x);
        return Math.pow(2, x) == n;
    }
}
