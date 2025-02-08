package com.pksv;

import java.util.HashSet;
import java.util.Set;

//Split a String Into the Max Number of Unique Substrings
public class SplitStringIntoSubstrings {
    public static void main(String[] args) {
//        String s = "ababccc";
//        String s = "aba";
//        String s = "aa";
        String s = "wwwzfvedwfvhsww";
        System.out.println(new SplitStringIntoSubstrings().maxUniqueSplit(s));
    }

    public int maxUniqueSplit(String s) {
        Set<String> substrings = new HashSet<>();
        return backtrack(s, 0, substrings);
    }

    private int backtrack(String s, int i, Set<String> substrings) {
        if (i == s.length()) {
            return 0;
        }
        int max = 0;
        for (int j = i + 1; j <= s.length(); j++) {
            String s1 = s.substring(i, j);
            if (!substrings.contains(s1)) {
                substrings.add(s1);
                max = Math.max(max, 1 + backtrack(s, j, substrings));
                substrings.remove(s1);
            }
        }
        return max;
    }
}
