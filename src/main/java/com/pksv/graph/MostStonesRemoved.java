package com.pksv;

import java.util.ArrayList;
import java.util.List;

//Most Stones Removed with Same Row or Column
public class MostStonesRemoved {
    public static void main(String[] args) {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        System.out.println(new MostStonesRemoved().removeStones(stones));
    }

    public int removeStones(int[][] stones) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = stones.length;
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int max1 = Math.max(stones[i][0], stones[i][1]);
            max = Math.max(max, max1);
            for (int j = i + 1; j < n; j++) {
                if (stones[j][0] == stones[i][0] || stones[j][1] == stones[i][1]) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[max + n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                count++;
            }
        }
        return n - count;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        for (int n : graph.get(node)) {
            if (!visited[n]) {
                dfs(n, graph, visited);
            }
        }
    }
}
