package com.pksv;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("geeksofrgeeks"));
    }

    public static Character findFirstNonRepeatingChar(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : count.keySet()) {
            if (count.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

}
