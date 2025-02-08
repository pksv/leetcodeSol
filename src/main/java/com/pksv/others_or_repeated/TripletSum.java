package com.pksv.others_or_repeated;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;
        System.out.println(Arrays.toString(new TripletSum().findTriplet(arr, target)));
    }

    private int[] findTriplet(int[] arr, int targetSum) {
        int[] triplet = new int[3];
        Arrays.fill(triplet, -1);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[j] + arr[k];
                if (targetSum - arr[i] == sum) {
                    return new int[]{arr[i], arr[j], arr[k]};
                }
                if (sum > targetSum) k--;
                else j++;
            }
        }
        return triplet;
    }
}
