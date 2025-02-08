package com.pksv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverageMarks {

    public static void main(String[] args) {
        List<Map<String, Integer>> marks = List.of(
                Map.of("Bob", 87),
                Map.of("Mike", 35),
                Map.of("Bob", 52),
                Map.of("Jason", 35),
                Map.of("Mike", 55),
                Map.of("Jessica", 99)
        );
        var x = new MaximumAverageMarks();
        x.print(marks);

        System.out.println(x.findMaximumAverageMarks(marks));
    }

    private void print(List<Map<String, Integer>> marks) {
        for (Map<String, Integer> mark : marks) {
            for (var x : mark.keySet()) {
                System.out.println("Name: " + x + " Marks: " + mark.get(x));
            }
        }
    }

    public int findMaximumAverageMarks(List<Map<String, Integer>> marks) {
        int maxAverage = 0;
        Map<String, int[]> maxMarks = new HashMap<>();
        for (Map<String, Integer> mark : marks) {
            for (var x : mark.keySet()) {
                var y = maxMarks.getOrDefault(x, new int[2]);
                y[0] += mark.get(x);
                y[1]++;
                maxMarks.put(x, y);
            }
        }
        for (var x : maxMarks.keySet()) {
            var y = maxMarks.get(x);
            int avg = y[0] / y[1];
            maxAverage = Math.max(maxAverage, avg);
        }
        return maxAverage;
    }
}
