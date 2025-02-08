package com.pksv.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
//        String s = "egg", t = "add";
//        String s = "foo", t = "bar";
        String s = "paper", t = "title";
//        String s = "badc", t = "baba";
        System.out.println(new IsomorphicStrings().isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else if (map.get(s.charAt(i)) == null || map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isIsomorphicOptimised(String s, String t) {
        int n = s.length();
        int[] c1 = new int[256], c2 = new int[256];
        for (int i = 0; i < n; i++) {
            if (c1[s.charAt(i)] != c2[t.charAt(i)]) return false;
            c1[s.charAt(i)] = i + 1;
            c2[t.charAt(i)] = i + 1;

        }
        return true;
    }
}
