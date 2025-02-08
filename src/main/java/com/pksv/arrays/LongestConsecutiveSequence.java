package com.pksv;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 1};
        System.out.println(new LongestConsecutiveSequence().longest(nums));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (var i : nums) {
            set.add(i);
        }

        int largest = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int l = 1;
                int next = i + 1;
                while (set.contains(next)) {
                    next++;
                    l++;
                }
                largest = Math.max(largest, l);
            }
        }
        return largest;
    }

    public int longest(int[] nums) {
        Arrays.sort(nums);
        int current = 1;
        int largest = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] - nums[i - 1] == 1) {
                    current++;
                } else {
                    largest = Math.max(current, largest);
                    current = 1;
                }
            }
        }
        largest = Math.max(largest, current);
        return largest;
    }
}
