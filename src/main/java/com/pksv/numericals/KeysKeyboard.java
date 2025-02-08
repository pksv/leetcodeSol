package com.pksv;

public class KeysKeyboard {
    public static void main(String[] args) {
        System.out.println(new KeysKeyboard().minSteps(1000));
    }

    public int minSteps(int n) {
        if (n == 1) return 0;
        int sol = 0;
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                sol += i;
                n /= i;
            }
            i++;
        }
        return sol;
    }
}