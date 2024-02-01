package com.pksv;

public class FindTheDifference {
    public static void main(String[] args) {
//        String s = "abcd", t = "abcde";
        String s = "", t = "y";
        System.out.println(new FindTheDifference().findTheDifference(s, t));
    }

    public char findTheDifference(String s, String t) {
        char sum = t.charAt(s.length());
        for (char c : s.toCharArray()) sum ^= c;
        for (char c : t.toCharArray()) sum ^= c;

        char c = 0;
        for (char cs : s.toCharArray()) c ^= cs;
        for (char ct : t.toCharArray()) c ^= ct;
//        return c;
        return sum;
    }
}
