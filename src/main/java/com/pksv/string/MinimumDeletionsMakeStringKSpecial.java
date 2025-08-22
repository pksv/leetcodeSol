package com.pksv.string;

import java.util.HashMap;

public class MinimumDeletionsMakeStringKSpecial {

    public static void main(String[] args) {
        String word = "aabcaba";
        int k = 0;
        System.out.println(new MinimumDeletionsMakeStringKSpecial().minimumDeletionsArray(word, k));
    }

    public int minimumDeletions(String word, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            var x = word.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int count = word.length();
        for (var x : map.values()) {
            var deleted = 0;
            for (var y : map.values()) {
                if (y < x) {
                    deleted += y;
                } else if (y > x + k) {
                    deleted += y - x - k;
                }
            }
            count = Math.min(count, deleted);
        }
        return count;
    }

    public int minimumDeletionsArray(String word, int k) {
        int[] chars = new int[26];
        for (int i = 0; i < word.length(); i++) {
            var x = word.charAt(i);
            chars[x - 'a'] += 1;
        }
        int count = word.length();
        for (var x : chars) {
            if(x == 0) continue;
            var deleted = 0;
            for (var y : chars) {
                if(y == 0) continue;
                if (y < x) {
                    deleted += y;
                } else if (y > x + k) {
                    deleted += y - x - k;
                }
            }
            count = Math.min(count, deleted);
        }
        return count;
    }
}