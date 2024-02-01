package com.pksv.string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
//        String pattern = "abba", s = "dog cat cat dog";
//        String pattern = "abba", s = "dog cat cat fish";
        String pattern = "abba", s = "dog dog dog dog";
//        String pattern = "aaaa", s = "dog cat cat dog";
        System.out.println(new WordPattern().wordPattern(pattern, s));
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> temp = new HashMap<>();
        var strings = s.split(" ");
        if (pattern.length() != strings.length) return false;
        for (int i = 0; i < strings.length; i++) {
            var c = pattern.charAt(i);
            if (temp.containsKey(c) || temp.containsValue(strings[i])) {
                var value = temp.get(c);
                if (!strings[i].equals(value)) {
                    return false;
                }
            }
            temp.put(c, strings[i]);
        }
        return true;
    }
}
