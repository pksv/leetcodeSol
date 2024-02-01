package com.pksv.numericals;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        long low = 0;
        long high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) return true;
            if (mid * mid < num) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
