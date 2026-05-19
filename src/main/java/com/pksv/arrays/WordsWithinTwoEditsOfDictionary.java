package com.pksv.arrays;

import java.util.ArrayList;
import java.util.List;

public class WordsWithinTwoEditsOfDictionary {
    public static void main(String[] args) {
//        String[] queries = {"word", "note", "ants", "wood"};
//        String[] dictionary = {"wood", "joke", "moat"};
        String[] queries = {"yes"};
        String[] dictionary = {"not"};

        System.out.println(new WordsWithinTwoEditsOfDictionary().twoEditWords(queries, dictionary));
    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        for (String query : queries) {
            for (String word : dictionary) {
                int edits = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != word.charAt(i)) {
                        edits++;
                    }
                    if (edits > 2) {
                        break;
                    }
                }
                if (edits <= 2) {
                    result.add(query);
                    break;
                }
            }
        }

        return result;
    }
}
