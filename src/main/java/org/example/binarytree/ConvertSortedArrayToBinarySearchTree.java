package org.example.binarytree;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] x = {-10, -3, 0, 5, 9};
        var y = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(x);

        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(y));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        root = sortedArrayToBST(nums, root);
        return root;
    }

    private TreeNode sortedArrayToBST(int[] nums, TreeNode root) {
        if (nums.length > 0) {
            var x = nums.length / 2;
            root = new TreeNode(nums[x]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, x), root.left);
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, x + 1, nums.length), root.right);
        }
        return root;
    }
}
