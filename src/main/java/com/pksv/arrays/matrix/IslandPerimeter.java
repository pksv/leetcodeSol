package com.pksv.arrays.matrix;

public class IslandPerimeter {
    public static void main(String[] args) {
//        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] grid = {{1}};
        System.out.println(new IslandPerimeter().islandPerimeter(grid));
    }

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                } else continue;
                if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                    perimeter--;
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    perimeter--;
                }
                if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                    perimeter--;
                }
                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    perimeter--;
                }
            }
        }

        return perimeter;
    }
}