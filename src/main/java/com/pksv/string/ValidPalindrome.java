package com.pksv.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        var s = "A man, a plan, a canal: Panama";
//        var s = "race a car";
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        var reverse = new StringBuilder(s).reverse().toString().toLowerCase();
        return s.equals(reverse);
    }
}
