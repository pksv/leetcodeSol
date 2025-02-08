package com.pksv;

//Minimum Number of Swaps to Make the String Balanced
public class MinimumNumberOfSwaps {
    public static void main(String[] args) {
        String s = "][][";
//        String s = "]]][[[";
        System.out.println(new MinimumNumberOfSwaps().minSwaps(s));
    }

    public int minSwaps(String s) {
        int i = 0;
        for (var c : s.toCharArray()) {
            if (c == '[') i++;
            else if (i > 0) i--;
        }
        return (i + 1) / 2;
    }
}
