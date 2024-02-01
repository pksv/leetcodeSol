package com.pksv.string;

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
        return sum;
    }
}
