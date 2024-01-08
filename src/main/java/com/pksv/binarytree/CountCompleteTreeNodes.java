package com.pksv.binarytree;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(
                        3,
                        new TreeNode(6),
                        null
                )
        );
        System.out.println(new CountCompleteTreeNodes().countNodes(node));
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
