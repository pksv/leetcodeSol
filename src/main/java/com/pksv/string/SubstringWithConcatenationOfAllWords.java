package com.pksv.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
//        String s = "barfoothefoobarman";
        String s = "bcabbcaabbccacacbabccacaababcbb";
//        String s = "wordgoodgoodgoodbestword";
//        String[] words = {"foo", "bar"};
        String[] words = {"c","b","a","c","a","a","a","b","c"};
//        String[] words = {"word", "good", "best", "word"};
//        String[] words = {"word", "good", "best", "good"};

        System.out.println(new SubstringWithConcatenationOfAllWords().findSubstring(s, words));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        int wordLen = words[0].length();
        int concatLen = wordLen * words.length;
        List<String> concatWords = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int i;
        for (i = 0; i < s.length() - concatLen + 1; i++) {
            String s1 = s.substring(i, i + concatLen);
            boolean bool = helper(s1, new ArrayList<>(Arrays.asList(words)), concatWords, wordLen);
            if (bool) result.add(i);
        }
        return result;
    }

    private boolean helper(String s1, List<String> words, List<String> concatWords, int wordLen) {
        if (concatWords.contains(s1)) return true;
        for (int i = 0; i < s1.length(); i += wordLen) {
            String word = s1.substring(i, i + wordLen);
            var x = words.remove(word);
            if (!x) return false;
        }
        concatWords.add(s1);
        return true;
    }

}
