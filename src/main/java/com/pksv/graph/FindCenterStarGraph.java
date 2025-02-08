package com.pksv.graph;

public class FindCenterStarGraph {
    public static void main(String[] args) {
//        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        int[][] edges = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        System.out.println(new FindCenterStarGraph().findCenter(edges));
    }

    public int findCenter(int[][] edges) {
        int x1 = edges[0][0];
        int x2 = edges[0][1];

        int y1 = edges[1][0];
        int y2 = edges[1][1];
        if (x1 == y1 || x1 == y2) {
            return x1;
        } else return x2;

    }
}
