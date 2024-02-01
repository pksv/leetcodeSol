package com.pksv.numericals;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(38));
    }

    public int addDigits(int num) {
        if (num < 9) return num;
        if (num % 9 == 0) return 9;
        else return num % 9;
    }
}
