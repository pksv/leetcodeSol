package com.pksv.numericals;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        var x = new PascalsTriangle().generateOptimised(31);
        x.forEach(System.out::println);
    }

    public List<List<Integer>> generate(int numRows) {
        var result = new ArrayList<>(List.of(List.of(1)));
        if (numRows == 1) return result;
        result.add(List.of(1, 1));
        if (numRows == 2) {
            return result;
        }
        int row = 3;
        var previous = result.get(1);
        while (row++ <= numRows) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < previous.size() - 1; i++) {
                temp.add(previous.get(i) + previous.get(i + 1));
            }
            temp.add(0, 1);
            temp.add(1);
            result.add(temp);
            previous = temp;
        }
        return result;
    }

    public List<List<Integer>> generateOptimised(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            var row = new PascalsTriangleTwo().getRow(i);
            result.add(row);
        }
        return result;
    }
}
