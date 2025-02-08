package com.pksv;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Minimum Number of Pushes to Type Word II
public class MinimumPushes {
    public static void main(String[] args) {
        String word = "abcde";
//        String word = "aabbccddeeffgghhiiiiii";
//        String word = "xyzxyzxyzxyz";
        System.out.println(new MinimumPushes().minimumPushesArr(word));
    }

    public int minimumPushes(String word) {
        Map<Character, Integer> count = new HashMap<>();
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        for (var c : word.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
            queue.remove(c);
            queue.offer(c);
        }
        int pushes = 0;
        int key = 0;
        while (!queue.isEmpty()) {
            int c = count.get(queue.poll());
            pushes += (((key++ / 8) + 1) * c);
        }

        return pushes;
    }

    public int minimumPushesArr(String word) {
        int[] count = new int[26];
        for (var c : word.toCharArray()) {
            count[c - 'a']++;
        }
        Arrays.sort(count);
        int pushes = 0;
        int key = 0;
        for (int i = 25; i >= 0; i--) {
            int c = count[i];
            pushes += (((key++ / 8) + 1) * c);
        }
        return pushes;
    }
}
