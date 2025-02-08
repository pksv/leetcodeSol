package com.pksv.tree;

public class FlipEquivalentBinaryTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(
                                5,
                                new TreeNode(7),
                                new TreeNode(8)
                        )
                ),
                new TreeNode(
                        3,
                        new TreeNode(6),
                        null
                )
        );
        TreeNode root2 = new TreeNode(
                1,
                new TreeNode(
                        3,
                        new TreeNode(6),
                        null
                ),
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(
                                5,
                                new TreeNode(8),
                                new TreeNode(7)
                        )
                )

        );
        System.out.println(new FlipEquivalentBinaryTrees().flipEquiv(root1, root2));
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return isEqual(root1, root2);
    }

    private boolean isEqual(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) return false;
        return (isEqual(root1.left, root2.left) || isEqual(root1.left, root2.right)) &&
                (isEqual(root1.right, root2.left) || isEqual(root1.right, root2.right));

    }
}
