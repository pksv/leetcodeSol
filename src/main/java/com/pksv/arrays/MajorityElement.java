package com.pksv.arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(new MajorityElement().majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        /*if(nums.length==1) return nums[0];
        Dictionary<Integer, Integer> d = new Hashtable<>();
        for (int num : nums) {
            Integer x = d.get(num);
            if (x != null) {
                d.remove(num);
                if (x + 1 > nums.length / 2)
                    return num;
                d.put(num, x + 1);
            } else {
                d.put(num, 1);
            }
        }

        return 0;*/

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
