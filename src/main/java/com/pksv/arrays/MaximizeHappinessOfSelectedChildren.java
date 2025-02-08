package com.pksv;

import java.util.Arrays;

public class MaximizeHappinessOfSelectedChildren {
    public static void main(String[] args) {
        int[] happiness = {2, 3, 4, 5};
        int k = 1;
        System.out.println(new MaximizeHappinessOfSelectedChildren().maximumHappinessSum(happiness, k));
    }

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long happinessSum = happiness[happiness.length - 1];
        int x = 1;
        for (int i = happiness.length - 2; i >= 0 && x < k; i--) {
            happinessSum += Math.max(happiness[i] - x++, 0);
        }
        return happinessSum;
    }
}
