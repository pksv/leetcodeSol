package com.pksv;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangleTwo().getRow(30));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int val = 1;
        for (int j = 0; j < rowIndex; j++) {
            row.add(val);
            val = val * (rowIndex - j) / (j + 1);
        }
        row.add(val);
        return row;
    }
}
