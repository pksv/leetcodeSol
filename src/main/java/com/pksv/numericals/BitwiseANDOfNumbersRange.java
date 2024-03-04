package com.pksv.numericals;

public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
        int left = 1;
        int right = 2147483647;
        System.out.println(new BitwiseANDOfNumbersRange().rangeBitwiseAnd(left, right));
    }

    public int rangeBitwiseAnd(int left, int right) {
//        long res = left;
        while (left < right) {
            right = right & (right - 1);
        }
//        for (long i = left + 1; i <= right; i++) {
//            res = res & i;
//        }
        return left & right;
    }
}
