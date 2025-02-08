package com.pksv.tree;

public class GoodLeafNodesPairs {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(
//                1,
//                new TreeNode(
//                        2,
//                        null,
//                        new TreeNode(4)
//                ),
//                new TreeNode(3)
//        );
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(
                        3,
                        new TreeNode(6),
                        new TreeNode(7)
                )
        );

        int val = new GoodLeafNodesPairs().countPairs(root, 3);

        System.out.println(val);
    }

    public int countPairs(TreeNode root, int distance) {
        int[] nodes = new int[1];
        dfs(root, distance, nodes);
        return nodes[0];
    }

    public int[] dfs(TreeNode root, int distance, int[] nodes) {
        if (root == null) return new int[distance + 1];

        if (root.right == null && root.left == null) {
            int[] node = new int[distance + 1];
            node[1] = 1;
            return node;
        }

        int[] left = dfs(root.left, distance, nodes);
        int[] right = dfs(root.right, distance, nodes);
        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance - i; j++) {
                nodes[0] += left[i] * right[j];
            }
        }

        int[] leaf = new int[distance + 1];
        for (int i = 1; i < distance; i++) {
            leaf[i + 1] = left[i] + right[i];
        }

        return leaf;
    }
}
