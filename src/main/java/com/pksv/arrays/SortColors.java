package com.pksv.arrays;

public class SortColors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for (int num : nums) {
            freq[num]++;
        }
        int pos = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i]-- > 0) nums[pos++] = i;
        }
    }
}
