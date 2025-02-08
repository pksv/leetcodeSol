package com.pksv.others_or_repeated;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome l = new LongestPalindrome();
        System.out.println(l.longestPalindrome("abccccdd"));
//        System.out.println(l.longestPalindrome("abba"));
//        System.out.println(l.longestPalindrome("ba"));
//        System.out.println(l.longestPalindrome("aba"));
//        System.out.println(l.longestPalindrome("ab"));
//        System.out.println(l.longestPalindrome("bba"));
    }

    public int longestPalindrome(String s) {
        int[] freq = new int[58];
        for (var c : s.toCharArray()) {
            freq[c - 'A']++;
        }
        int count = 0;
        for (int i = 0; i < 58; i++) {
            count += freq[i] / 2 * 2;
            if (count > 0)
                System.out.println("i = " + i + " " + count);
        }
        return count < s.length() ? count + 1 : count;
    }
}
