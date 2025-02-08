package com.pksv.arrays.matrix;

public class PathWithMaximumGold {
    public static void main(String[] args) {
//        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
//        int[][] grid = {{1, 0, 7}, {2, 0, 6}, {3, 4, 5}, {0, 3, 0}, {9, 0, 20}};
        int[][] grid = {
                {1, 0, 7, 0, 0, 0},
                {2, 0, 6, 0, 1, 0},
                {3, 5, 6, 7, 4, 2},
                {4, 3, 1, 0, 2, 0},
                {3, 0, 5, 0, 20, 0}};
        System.out.println(new PathWithMaximumGold().getMaximumGold(grid));
    }

    public int getMaximumGold(int[][] grid) {
        int maxGold;
        maxGold = getGridWithNoZeros(grid);
        if (maxGold != 0) return maxGold;

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0) {
                    int currentGold = getGold(grid, i, j);
                    maxGold = Math.max(maxGold, currentGold);
                }
            }
        }
        return maxGold;
    }

    private int getGridWithNoZeros(int[][] grid) {
        int count = 0;
        for (int[] value : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (value[j] == 0) return 0;
                else count += value[j];
            }
        }
        return count;
    }

    public int getGold(int[][] grid, int row, int col) {
        int currentGold = grid[row][col];
        grid[row][col] = 0;
        int next = 0;
        if (row + 1 < grid.length && grid[row + 1][col] != 0) {
            next = Math.max(next, getGold(grid, row + 1, col));
        }
        if (row - 1 > -1 && grid[row - 1][col] != 0) {
            next = Math.max(next, getGold(grid, row - 1, col));
        }
        if (col + 1 < grid[0].length && grid[row][col + 1] != 0) {
            next = Math.max(next, getGold(grid, row, col + 1));
        }
        if (col - 1 > -1 && grid[row][col - 1] != 0) {
            next = Math.max(next, getGold(grid, row, col - 1));
        }
        grid[row][col] = currentGold;
        currentGold += next;
        return currentGold;
    }
}
