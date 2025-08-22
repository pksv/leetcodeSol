package com.pksv.arrays.matrix;

public class MinAreaToCoverOnes {
    public static void main(String[] args) {
//        int[][] grid = {{0, 1, 0},{1, 0, 1}};
        int[][] grid = {{1, 0}, {0, 0}};
//        int[][] grid = {{0}, {1}};
        System.out.println(new MinAreaToCoverOnes().minimumArea(grid));
    }

    public int minimumArea(int[][] grid) {
        int maxHeight = -1;
        int maxLength = -1;
        int minHeight = grid.length;
        int minLength = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    minHeight = Math.min(minHeight, i);
                    minLength = Math.min(minLength, j);
                    maxHeight = Math.max(maxHeight, i);
                    maxLength = Math.max(maxLength, j);
                }
            }
        }
        return (maxHeight - minHeight + 1) * (maxLength - minLength + 1);
    }
}
