package com.pksv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//        int[][] intervals = {{1, 4}, {4, 5}};
        System.out.println(Arrays.deepToString(new MergeIntervals().merge(intervals, true)));
    }

    public int[][] merge(int[][] intervals) {
        List<Integer[]> newIntervals = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (var interval : intervals) {
            if (interval[0] > end) {
                newIntervals.add(new Integer[]{start, end});
                start = interval[0];
            }
            end = Math.max(interval[1], end);
        }
        newIntervals.add(new Integer[]{start, end});

        int[][] solution = new int[newIntervals.size()][];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = new int[]{newIntervals.get(i)[0], newIntervals.get(i)[1]};
        }
        return solution;
    }

    private int[][] merge(int[][] intervals, boolean def) {
        int max = -1;
        for (var i : intervals) {
            max = Math.max(i[0], max);
        }
        if (max == -1) return new int[][]{intervals[0]};
        int[] time = new int[max + 1];
        for (int[] interval : intervals) {
            time[interval[0]] = Math.max(time[interval[0]], interval[1]);
        }
        List<Integer[]> newIntervals = new ArrayList<>();
        int start = -1, end = -1;
        int i = -1;
        while (++i <= max) {
            if (time[i] != 0) {
                if (start == -1)
                    start = i;
                end = Math.max(end, time[i]);
            }
            if (end == i) {
                newIntervals.add(new Integer[]{start, end});
                start = -1;
                end = -1;
            }
        }
        newIntervals.add(new Integer[]{start, end});
        int[][] solution = new int[newIntervals.size()][];
        for (i = 0; i < solution.length; i++) {
            solution[i] = new int[]{newIntervals.get(i)[0], newIntervals.get(i)[1]};
        }
        return solution;
    }
}
