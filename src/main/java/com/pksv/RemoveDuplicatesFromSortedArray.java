package com.pksv;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
//        List<Integer> result = new ArrayList<>();
        /*for (int num : nums) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }*/
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[counter] != nums[i]){
                nums[++counter] = nums[i];
            }
        }
        return counter + 1;
    }

    public int x(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
