package com.pksv;

import java.util.HashMap;
import java.util.Map;

public class MaximumScoreWordsFormedByLetters {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dad", "good"};
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(new MaximumScoreWordsFormedByLetters().maxScoreWords(words, letters, score));
    }

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character, Integer> letterMap = new HashMap<>();
        for (var c : letters) {
            letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
        }
        return maxScoreWords(words, letterMap, score, 0, 0, 0);
    }

    public int maxScoreWords(String[] words, Map<Character, Integer> letters, int[] score, int index, int current, int totalScore) {
        totalScore = Math.max(totalScore, current);
        if (index == words.length) {
            return totalScore;
        }
        for (int i = index; i < words.length; i++) {
            var word = words[i];
            Map<Character, Integer> letterMap = new HashMap<>(letters);
            int curr = 0;
            boolean flag = true;
            for (var c : word.toCharArray()) {
                if (letterMap.containsKey(c)) {
                    curr += score[c - 'a'];
                    letterMap.put(c, letterMap.get(c) - 1);
                    if (letterMap.get(c) == 0) {
                        letterMap.remove(c);
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                totalScore = maxScoreWords(words, letterMap, score, i + 1, curr + current, totalScore);
            }
        }
        return totalScore;
    }
}
