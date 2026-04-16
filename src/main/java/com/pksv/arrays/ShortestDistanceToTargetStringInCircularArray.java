package com.pksv.arrays;

public class ShortestDistanceToTargetStringInCircularArray {
    public static void main(String[] args) {
//        String[] words = {"hello", "i", "am", "leetcode", "hello"};
//        String target = "hello";
//        int startIndex = 1;

//        String [] words = {"a", "b", "leetcode"};
//        String target = "leetcode";
//        int startIndex = 0;

        String[] words = {"i", "eat", "leetcode"};
        String target = "ate";
        int startIndex = 0;

        System.out.println(new ShortestDistanceToTargetStringInCircularArray().closestTarget(words, target, startIndex));
    }

    public int closestTarget(String[] words, String target, int startIndex) {
        int len = words.length;
        int result = len + 1;
        for (int i = 0; i < len; i++) {
            if (words[i].equals(target)) {
                int temp = Math.abs(i - startIndex);
                result = Math.min(result, temp);
                result = Math.min(result, Math.abs(temp - len));
            }
        }
        return result != len + 1 ? result : -1;
    }
}
