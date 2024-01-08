package com.pksv.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1, 2, 3};
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1, 0, 1, 1};
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(i - j) > k) break;
                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
                    return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicateUsingMap(int[] nums, int k) {
        Map<Integer, Integer> valIndexMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer duplicate = valIndexMap.put(nums[i], i);
            if (duplicate != null && duplicate != i && Math.abs(duplicate - i) <= k) {
                return true;
            }
        }
        return false;
    }
}
