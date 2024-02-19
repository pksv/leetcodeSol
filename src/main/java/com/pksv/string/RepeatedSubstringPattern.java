package com.pksv.string;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
//        String s = "abcabcabcabc";
//        String s = "abaababaab";
//        String s = "ada";
//        String s = "adad";
        String s = "adadad";
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern(s));
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                StringBuilder c = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    c.append(s, 0, i);
                }
                if(s.contentEquals(c)){
                    return true;
                }
            }
        }
        return false;
    }
}
