package com.pksv;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        int rev = 0;
        for (int i = x ; i > 0; i/=10) {
            rev = rev * 10 + i % 10;
        }
        return rev == x;
    }
}
