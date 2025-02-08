package com.pksv.string;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
//        String[] words = {"bella", "label", "roller"};
        String[] words = {"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"};
//        String[] words = {"cool", "lock", "cook"};
        System.out.println(new FindCommonCharacters().commonChars(words));
    }

    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] freq = count(words[0]);
        for (int i = 1; i < words.length; i++) {
            int[] temp = count(words[i]);
            for (int j = 0; j < freq.length; j++) {
                freq[j] = Math.min(freq[j], temp[j]);
            }
        }
        for (int i = 0; i < freq.length; i++) {
            String s = String.valueOf((char) (i + 'a'));
            while (freq[i]-- > 0) {
                result.add(s);
            }
        }
        return result;
    }

    private int[] count(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}
