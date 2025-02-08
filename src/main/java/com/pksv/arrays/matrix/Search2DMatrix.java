package com.pksv.arrays.matrix;

public class Search2DMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] matrix = {{-10, -8}, {-6, -5}, {-2, -2}, {-1, 0}, {3, 4}, {7, 7}, {8, 9}, {10, 10}, {11, 11}, {12, 14}, {15, 16}, {17, 19}, {20, 21}, {22, 22}, {25, 27}, {28, 30}, {32, 32}, {35, 36}};
//        int[][] matrix = {{1, 3}};
//        int[][] matrix = {{1}};
        int target = 16;

        System.out.println(new Search2DMatrix().searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length - 1;
        int start = 0, end = matrix[0].length - 1;
        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (matrix[mid][0] <= target && matrix[mid][end] >= target) break;
            else if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else top = mid + 1;
        }
        int row = (top + bottom) / 2;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }

        return false;
    }
}
