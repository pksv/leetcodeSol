package com.pksv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Uncommon Words from Two Sentences
public class UncommonWords {
    public static void main(String[] args) {

    }

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();
        List<String> sol = new ArrayList<>();
        for (var s : s1.split(" ")) {
            int c = count.getOrDefault(s, 0) + 1;
            count.put(s, c);
        }
        for (var s : s2.split(" ")) {
            int c = count.getOrDefault(s, 0) + 1;
            count.put(s, c);
        }
        for (var s : count.keySet()) {
            if (count.get(s) == 1) {
                sol.add(s);
            }
        }

        return sol.toArray(new String[0]);
    }
}
