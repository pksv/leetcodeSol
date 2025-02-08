package com.pksv.string;

public class MergeStringsAlternately {
    public static void main(String[] args) {
//        String word1 = "abc", word2 = "pqr";
        String word1 = "abcd", word2 = "pq";
        System.out.println(new MergeStringsAlternately().mergeAlternately(word1, word2));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int n = Math.min(word1.length(), word2.length());
        for (int i = 0; i < n; i++) {
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            s.append(word1.substring(word2.length()));
        } else {
            s.append(word2.substring(word1.length()));
        }
        return s.toString();
    }
}
