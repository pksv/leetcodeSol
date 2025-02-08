package com.pksv.numericals;

public class PowerOfNumber {
    public static void main(String[] args) {
        double x = 2.00000;
//        int n = -2;
        int n = -2147483648;
        System.out.println(new PowerOfNumber().myPow(x, n));
    }

    public double myPow(double x, int n) {
        long n1 = n;
        if (n1 == 0) return 1;
        if (n1 < 0) {
            x = 1 / x;
            n1 = -n1;
        }
        double sol = 1d;
        while (n1 > 0L) {
            if (n1 % 2L == 1L) {
                sol *= x;
            }
            x *= x;
            n1 /= 2L;
        }
        return sol;
    }
}
