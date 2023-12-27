package com.pksv.binarytree;

public class BalancedBinaryTree {
    public static void main(String[] args) {
/*        TreeNode node = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );*/

        TreeNode node = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(
                                3,
                                new TreeNode(4),
                                new TreeNode(41)
                        ),
                        new TreeNode(3)
                ),
                new TreeNode(2)
        );

        System.out.println(new BalancedBinaryTree().isBalanced(node));
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
