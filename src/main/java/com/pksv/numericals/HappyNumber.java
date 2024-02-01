package com.pksv.numericals;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(7));
    }

    public boolean isHappy(int n) {
        int slow = getSum(n);
        int fast = getSum(getSum(n));
        while (slow != fast) {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }
        return slow == 1;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + ((n % 10) * (n % 10));
            n = n / 10;
        }
        return sum;
    }
}
