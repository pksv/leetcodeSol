package com.pksv.tree;

import java.util.Arrays;

//Kth Largest Sum in a Binary Tree
public class KthLargestSumBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(
                        8,
                        new TreeNode(
                                2,
                                new TreeNode(4),
                                new TreeNode(6)
                        ),
                        new TreeNode(1)
                ),
                new TreeNode(
                        9,
                        new TreeNode(3),
                        new TreeNode(7)
                )
        );

//        TreeNode root = new TreeNode(
//                1,
//                new TreeNode(
//                        2,
//                        new TreeNode(3),
//                        null
//                ),
//                null
//        );
        int k = 2;
        System.out.println(new KthLargestSumBinaryTree().kthLargestLevelSum(root, k));
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        long[] levelSum = new long[100001];
        int level = bfs(0, root, levelSum);
        if (level < k)
            return -1;
        Arrays.sort(levelSum);
        int x = levelSum.length - k;
        return levelSum[x];
    }

    private int bfs(int i, TreeNode root, long[] levelSum) {
        if (root == null) return i;
        levelSum[i] += root.val;
        int l = bfs(i + 1, root.right, levelSum);
        int r = bfs(i + 1, root.left, levelSum);
        return Math.max(l, r);
    }
}
