package com.pksv;

public class MaximumNumberBalloons {
    public static void main(String[] args) {
//        String text = "nlaebolko";
        String text = "ballon";
        System.out.println(new MaximumNumberBalloons().maxNumberOfBalloons(text));
    }

    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for (var c : text.toCharArray()) {
            count[c - 'a']++;
        }


        return Math.min(count['b' - 'a'],
                Math.min(count[0],
                        Math.min(count['l' - 'a'] / 2,
                                Math.min(count['o' - 'a'] / 2, count['n' - 'a']))));
    }
}
