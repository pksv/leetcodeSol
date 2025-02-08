package com.pksv;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Sum of Prefix Scores of Strings
public class SumOfPrefix {

    Trie root = new Trie();

    public static void main(String[] args) {
//        String[] words = {"abc", "ab", "bc", "b"};
        String[] words = {"abcd"};
        System.out.println(Arrays.toString(new SumOfPrefix().sumPrefixScores(words)));
    }

    private int[] sumPrefixScores(String[] words) {
        for (String word : words) {
            insert(word);
        }
        int[] sum = new int[words.length];
        int i = 0;
        for (String word : words) {
            sum[i++] = count(word);
        }
        return sum;
    }

    private void insert(String word) {
        Trie curr = root;
        for (var c : word.toCharArray()) {
            if (curr.next[c - 'a'] == null) {
                curr.next[c - 'a'] = new Trie();
            }

            curr.next[c - 'a'].count++;
            curr = curr.next[c - 'a'];
        }
    }

    private int count(String word) {
        Trie curr = root;
        int count = 0;
        for (var c : word.toCharArray()) {
            count += curr.next[c - 'a'].count;
            curr = curr.next[c - 'a'];
        }
        return count;
    }

    //Not optimal
    public int[] sumPrefixScoresNOS(String[] words) {
        int[] solution = new int[words.length];
        Map<String, Integer[]> prefixes = new HashMap<>();
        String[][] prefix = new String[words.length][];
        for (int i = 0; i < words.length; i++) {
            prefix[i] = getPrefixes(words[i]);
            for (var p : prefix[i]) {
                if (!prefixes.containsKey(p)) prefixes.put(p, new Integer[]{0});
            }
        }
        for (var p : prefixes.keySet()) {
            int count = 0;
            for (var word : words) {
                if (word.indexOf(p) == 0) {
                    count++;
                }
            }
            prefixes.get(p)[0] = count;
        }

        for (int i = 0; i < prefix.length; i++) {
            int count = 0;
            for (var p : prefix[i]) {
                count += prefixes.get(p)[0];
            }
            solution[i] = count;
        }

        return solution;
    }

    private String[] getPrefixes(String word) {
        String[] arr = new String[word.length()];
        for (int i = 1; i <= word.length(); i++) {
            arr[i - 1] = word.substring(0, i);
        }
        return arr;
    }
}

class Trie {
    Trie[] next = new Trie[26];
    int count = 0;
}
