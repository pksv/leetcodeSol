package com.pksv.arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubarrayWithAtMostKFrequency {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
//        int[] nums = {1, 2, 1, 2, 1, 2, 1, 2};
        int[] nums = {1, 4, 4, 3};
//        int[] nums = {5, 5, 5, 5, 5, 5, 5};
//        int[] nums = {2, 2, 3};
//        int[] nums;
//        try {
//            nums = new ArrayLongInput().getObstacles();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        int k = 1;
        System.out.println(new LengthOfLongestSubarrayWithAtMostKFrequency().maxSubarrayLength2(nums, k));
    }

    public int maxSubarrayLength(int[] nums, int k) {
        if (k == 0) return 0;
        int count = 0;
        int i = 0;
        for (int j = nums.length; j > i; j--) {
            Map<Integer, Integer> s = new HashMap<>();
            int c = 0;
            for (int l = i; l <= j && l < nums.length; l++) {
                int x = s.get(nums[l]) == null ? 0 : s.get(nums[l]);
                if (x < k) {
                    c++;
                    s.put(nums[l], ++x);
                } else break;
            }
            if (count < c) count = c;
            if (j - 1 == i && i + 1 < nums.length) {
                i++;
                j = nums.length;
            }
        }
        return count;
    }

    public int maxSubarrayLength2(int[] nums, int k) {
        if (k == 0) return 0;
        int i = 0;
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int l = 0; l < nums.length; l++) {
            map.put(nums[l], map.getOrDefault(nums[l], 0) + 1);
            while (map.get(nums[l]) > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            max = Math.max(max, l - i + 1);
        }
        return max;
    }

    public int maxSubarrayLength1(int[] nums, int k) {
        int largest = 0;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
            int freq = counts.get(nums[i]);
            if (freq > k) {
                do {
                    counts.put(nums[j], counts.get(nums[j]) - 1);
                    j++;
                } while (nums[j - 1] != nums[i]);
            }
            largest = (i - j) >= largest ? i - j + 1 : largest;
        }
        return largest;
    }
}
