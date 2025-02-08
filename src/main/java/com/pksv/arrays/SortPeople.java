package com.pksv;

import java.util.Map;
import java.util.TreeMap;

public class SortPeople {
    public static void main(String[] args) {

    }

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        String[] sol = new String[names.length];
        int i = names.length - 1;
        for (var key : map.keySet()) {
            sol[i--] = map.get(key);
        }
        return sol;
    }
}
