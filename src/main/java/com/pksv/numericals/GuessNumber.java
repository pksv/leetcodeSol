package com.pksv.numericals;

public class GuessNumber {


    public static void main(String[] args) {
        System.out.println(new GuessNumber().guessNumber(1000));
    }

    int guess(int num) {
        int n = 50;
        return Integer.compare(n, num);
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = 1;
        while (guess(mid) != 0) {
            mid = low + (high - low) / 2;
            if (guess(mid) == 1) low = mid + 1;
            else high = mid - 1;
        }
        return mid;
    }
}
