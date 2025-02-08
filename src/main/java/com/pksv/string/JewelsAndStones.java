package com.pksv.string;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
//        String jewels = "aA", stones = "aAAbbbb";
        String jewels = "z", stones = "ZZ";
        System.out.println(new JewelsAndStones().numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStonesSet(String jewels, String stones) {
        Set<Character> c = new HashSet<>();
        for (var jewel : jewels.toCharArray()) {
            c.add(jewel);
        }
        int count = 0;
        for (var stone : stones.toCharArray()) {
            if (c.contains(stone)) count++;
        }
        return count;
    }

    public int numJewelsInStones(String jewels, String stones) {
        int n = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) n++;
        }
        return n;
    }
}
