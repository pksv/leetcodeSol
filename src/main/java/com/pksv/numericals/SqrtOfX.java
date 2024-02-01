package com.pksv.numericals;

public class SqrtOfX {

    public static void main(String[] args) {
        System.out.println(new SqrtOfX().mySqrt(2147483647));
    }

    /*    public int mySqrt(int x) {
            if (x <= 1) {
                return x;
            }
            for (long i = 1; i <= (x / 2) + 1; i++) {
                if (i * i > x) {
                    return (int) (i - 1);
                }
                if (i * i == x) {
                    return (int) i;
                }
            }
            return 0;
        }   */
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("start" + start + "mid " + mid + "end " + end);
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return end;
    }
}
