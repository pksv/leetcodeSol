package com.pksv.tree;

public class EvaluateBooleanBinaryTree {
    public static void main(String[] args) {
//        Node root = new Node(2,
//                new Node(
//                        1
//                ),
//                new Node(
//                        3,
//                        new Node(0),
//                        new Node(1)
//                )
//        );
        TreeNode root = new TreeNode(0);
        System.out.println(new EvaluateBooleanBinaryTree().evaluateTree(root));
    }

    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val != 0;
        }

        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
