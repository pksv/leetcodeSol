package com.pksv.arrays;


//Minimum Difference Between Largest and Smallest Value in Three Moves
public class MinimumDifference {
    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4};
        System.out.println(new MinimumDifference().minDifference(nums));
    }

    public int minDifference(int[] nums) {
        if (nums.length < 4) return 0;
        int min1, min2, min3, min4, max1, max2, max3, max4;
        int ans = Integer.MAX_VALUE;
        min1 = min2 = min3 = min4 = Integer.MAX_VALUE;
        max1 = max2 = max3 = max4 = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min1) {
                min4 = min3;
                min3 = min2;
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min4 = min3;
                min3 = min2;
                min2 = n;
            } else if (n < min3) {
                min4 = min3;
                min3 = n;
            } else if (n < min4) min4 = n;
            if (n > max1) {
                max4 = max3;
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max4 = max3;
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max4 = max3;
                max3 = n;
            } else if (n > max4) max4 = n;
        }
        ans = Math.min(ans, max4 - min1);
        ans = Math.min(ans, max3 - min2);
        ans = Math.min(ans, max2 - min3);
        ans = Math.min(ans, max1 - min4);

        return ans;
    }
}
