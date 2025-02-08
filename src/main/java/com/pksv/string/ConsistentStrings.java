package com.pksv;

//Count the Number of Consistent Strings
public class ConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(new ConsistentStrings().countConsistentStrings(allowed, words));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean[] allow = new boolean[26];
        for (var c : allowed.toCharArray()) {
            allow[c - 'a'] = true;
        }
        for (var word : words) {
            boolean flag = false;
            for (var c : word.toCharArray()) {
                if (!allow[c - 'a']) {
                    flag = true;
                    break;
                }
            }
            if (!flag) count++;
        }
        return count;
    }
}
