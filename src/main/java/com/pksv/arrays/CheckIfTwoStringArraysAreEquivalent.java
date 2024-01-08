package com.pksv.arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(new CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual1(word1, word2));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int len = Math.max(word1.length, word2.length);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (i < word1.length) {
                s1.append(word1[i]);
            }
            if (i < word2.length) {
                s2.append(word2[i]);
            }
        }
        return s1.toString().contentEquals(s2);
    }

    public boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
