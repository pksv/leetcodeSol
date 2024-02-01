package com.pksv.numericals;

public class NimGame {

    public static void main(String[] args) {
        System.out.println(new NimGame().canWinNim(4));
        System.out.println(new NimGame().canWinNim(1));
        System.out.println(new NimGame().canWinNim(2));
        System.out.println(new NimGame().canWinNim(6));
        System.out.println(new NimGame().canWinNim(5));
        System.out.println(new NimGame().canWinNim(7));
        System.out.println(new NimGame().canWinNim(15));
        System.out.println(new NimGame().canWinNim(16));
        System.out.println(new NimGame().canWinNim(17));
        System.out.println(new NimGame().canWinNim(20));
        System.out.println(new NimGame().canWinNim(23));
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
