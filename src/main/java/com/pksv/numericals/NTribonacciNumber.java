package com.pksv.numericals;

public class NTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(new NTribonacciNumber().tribonacci(4));
    }

    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int sum;
        if (n == 0) {
            return 0;
        }
        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}
