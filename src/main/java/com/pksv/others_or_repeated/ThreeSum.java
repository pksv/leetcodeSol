package com.pksv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {0, 8, 2, -9, -14, 5, 2, -5, -5, -9, -1, 3, 1, -8, 0, -3, -12, 2, 11, 9, 13, -14, 2, -15, 4, 10, 9, 7, 14, -8, -2, -1, -15, -15, -2, 8, -3, 7, -12, 8, 6, 2, -12, -8, 1, -4, -3, 5, 13, -7, -1, 11, -13, 8, 4, 6, 3, -2, -2, 3, -2, 3, 9, -10, -4, -8, 14, 8, 7, 9, 1, -2, -3, 5, 5, 5, 8, 9, -5, 6, -12, 1, -5, 12, -6, 14, 3, 5, -11, 8, -7, 2, -12, 9, 8, -1, 9, -1, -7, 1, -7, 1, 14, -3, 13, -4, -12, 6, -9, -10, -10, -14, 7, 0, 13, 8, -9, 1, -2, -5, -14};
        System.out.println(new ThreeSum().threeSum(nums));
    }

    public List<List<Integer>> threeSums(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                for (int k = 0; k < nums.length; k++) {
                    if (k == i || k == j) continue;
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        var temp = List.of(nums[i], nums[j], nums[k]);
                        if (!checkIfExists(temp, solution))
                            solution.add(temp);
                    }
                }
            }
        }
        return solution;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> solution = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) j++;
                else if (sum > 0) k--;
                else {
                    solution.add(List.of(nums[i], nums[j], nums[k]));
                    do {
                        j++;
                    } while (nums[j] == nums[j + 1] && j < k);
                }
            }
        }
        return solution;
    }

    private boolean checkIfExists(List<Integer> temp, List<List<Integer>> solution) {
        int n1 = temp.get(0), n2 = temp.get(1), n3 = temp.get(2);
        return solution.contains(List.of(n1, n2, n3)) ||
                solution.contains(List.of(n1, n3, n2)) ||
                solution.contains(List.of(n2, n1, n3)) ||
                solution.contains(List.of(n2, n3, n1)) ||
                solution.contains(List.of(n3, n2, n1)) ||
                solution.contains(List.of(n3, n1, n2));
    }
}
