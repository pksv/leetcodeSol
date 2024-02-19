package com.pksv.string;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s1 = "abccccdd";
//        String s1 = "bananas";
        String s2 = "bb";
        String s3 = "a";
        System.out.println(s1 + " " + new LongestPalindrome().longestPalindrome(s1));
        System.out.println(s2 + " " + new LongestPalindrome().longestPalindrome(s2));
        System.out.println(s3 + " " + new LongestPalindrome().longestPalindrome(s3));
    }

    public int longestPalindrome(String s) {
        int[] freq = new int[58];
        for (var c : s.toCharArray()) {
            freq[c - 'A']++;
        }
        int count = 0;
        for (int i = 0; i < 58; i++) {
            count += freq[i] / 2 * 2;
        }
        return count < s.length() ? count + 1 : count;
    }
}
