package com.pksv.tree;

public class DeleteLeavesWithGivenValue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(2),
                        null
                ),
                new TreeNode(
                        3,
                        new TreeNode(2),
                        new TreeNode(4)
                )
        );
        int target = 2;
        var result = new DeleteLeavesWithGivenValue().removeLeafNodes(root, target);

        printTree(result);

    }

    private static void printTree(TreeNode root) {
        System.out.println(root.val);
        if (root.left != null) {
            printTree(root.left);
        }
        if (root.right != null) {
            printTree(root.right);
        }
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }
        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }
}
