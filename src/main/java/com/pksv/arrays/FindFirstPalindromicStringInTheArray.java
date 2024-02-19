package com.pksv.arrays;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
        for (var word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return word;
//            StringBuilder s = new StringBuilder(word);
//            if (s.reverse().toString().equals(word)) {
//                return word;
//            }
        }
        return "";
    }
}
