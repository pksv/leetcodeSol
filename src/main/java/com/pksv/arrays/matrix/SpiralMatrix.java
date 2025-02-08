package com.pksv.arrays.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}};
        System.out.println(new SpiralMatrix().spiralOrder(matrix));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int up = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;
        List<Integer> solution = new ArrayList<>();
        while (up <= down && left <= right) {
            int i;
            for (i = left; i <= right; i++) {
                solution.add(matrix[up][i]);
            }
            up++;
            for (i = up; i <= down; i++) {
                solution.add(matrix[i][right]);
            }
            right--;
            if (up <= down) {
                for (i = right; i >= left; i--) {
                    solution.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right) {
                for (i = down; i >= up; i--) {
                    solution.add(matrix[i][left]);
                }
                left++;
            }
        }

        return solution;
    }
}
