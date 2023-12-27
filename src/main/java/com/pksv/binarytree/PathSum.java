package com.pksv.binarytree;

public class PathSum {
    public static void main(String[] args) {

        /*TreeNode node = new TreeNode(
                5,
                new TreeNode(
                        4,
                        new TreeNode(
                                11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(
                        8,
                        new TreeNode(13),
                        new TreeNode(
                                4,
                                null,
                                new TreeNode(1)
                        )

                )
        );*/
        /*TreeNode node = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3)
        );*/
        /*TreeNode node = new TreeNode(
                1,
                new TreeNode(-2),
                new TreeNode(3)
        );*/
        /*TreeNode node = new TreeNode(
                -2,
                null,
                new TreeNode(-3)
        );*/
        TreeNode node = new TreeNode(
                1,
                new TreeNode(
                        -2,
                        new TreeNode(
                                1,
                                new TreeNode(-1),
                                null
                        ),
                        new TreeNode(3)
                ),
                new TreeNode(
                        -3,
                        new TreeNode(-2),
                        null
                )
        );
        System.out.println(new PathSum().hasPathSum(node, 2));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            sum += root.val;
            if (targetSum == sum) return true;
        }
        var left = hasPathSum(root.left, targetSum, sum + root.val);
        var right = hasPathSum(root.right, targetSum, sum + root.val);

        return left || right;
    }
}
