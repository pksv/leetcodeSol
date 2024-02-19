package com.pksv.numericals;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(new ArrangingCoins().arrangeCoins1(1804289383));
    }

    public int arrangeCoins(int n) {
        int i = 1;
        while (i <= n) {
            n -= i;
            i++;
            if (n < i)
                return i - 1;
            if (i == n)
                return i;
        }
        return i;
    }

    public int arrangeCoins1(int n) {
        return (int) (Math.sqrt((2 * n) + .25d) - .5d);
    }
}
