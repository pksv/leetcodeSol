package com.pksv.binarytree;

public class MaxMinDepthOfBinaryTree {
    //    [2,null,3,null,4,null,5,null,6]
    public static void main(String[] args) {
//        var root = new TreeNode(
//                3,
//                new TreeNode(9),
//                new TreeNode(
//                        20,
//                        new TreeNode(15),
//                        new TreeNode(7)
//                )
//        );
        var root = new TreeNode(
                2,
                null,
                new TreeNode(
                        3,
                        null,
                        new TreeNode(
                                4,
                                null,
                                new TreeNode(
                                        5,
                                        null,
                                        new TreeNode(6))
                        )
                )
        );
        System.out.println("min = " + new MaxMinDepthOfBinaryTree().minDepth(root));
        System.out.println("max = " + new MaxMinDepthOfBinaryTree().maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int i) {
        if (root == null) return i;
        return Math.max(maxDepth(root.left, i + 1), maxDepth(root.right, i + 1));
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return 1 + right;
        if (root.right == null)
            return 1 + left;
        return Math.min(left, right) + 1;
    }
}
