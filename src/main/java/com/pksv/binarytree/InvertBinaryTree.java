package com.pksv.binarytree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                4,
                new TreeNode(
                        2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(
                        7,
                        new TreeNode(6),
                        new TreeNode(9)
                )
        );

        var result = new InvertBinaryTree().invertTree(root);
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(result));
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        root.left = invertTree(root.right);
        root.right = invertTree(root.left);
        return root;
    }
}
