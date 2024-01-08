package com.pksv.binarytree;

public class RangeSumOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                10,
                new TreeNode(
                        5,
                        new TreeNode(3),
                        new TreeNode(7)
                ),
                new TreeNode(
                        15,
                        null,
                        new TreeNode(18)
                )
        );

        System.out.println(new RangeSumOfBST().rangeSumBST(root, 7, 15));
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        int left = 0, right = 0;
        if (root.val > low) left = rangeSumBST(root.left, low, high);
        if (root.val < high) right = rangeSumBST(root.right, low, high);
        if (root.val >= low && root.val <= high) {
            return left + right + root.val;
        } else return left + right;
    }

//    public int rangeSumBST(TreeNode root, int low, int high) {
//
//        return 0;
//    }
}
