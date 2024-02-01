package com.pksv.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(new ValidAnagram().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (result.isEmpty() || !result.containsKey(c)) {
                result.put(c, 1);
            } else {
                var x = result.get(c);
                result.remove(c);
                result.put(c, x + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            var c = t.charAt(i);
            if (result.containsKey(c)) {
                var x = result.get(c);
                result.remove(c);
                if (x != 1) {
                    result.put(c, x - 1);
                }
            } else return false;
        }
        return result.isEmpty();
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for (int i : map) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
