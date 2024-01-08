package com.pksv.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        null
                )
        );*/
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

        System.out.println(Arrays.toString(new BinaryTreePreorderTraversal().preorderTraversalOptimal(root).toArray()));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (root == null) return solution;
            solution.add(root.val);
            if (root.left != null) {
                stack.push(root);
                root = root.left;
                continue;
            }
            if (root.right != null) {
//                stack.push(root);
                root = root.right;
                continue;
            }
            if (stack.empty()) return solution;
            do {
                root = stack.isEmpty() ? root : stack.pop().right;
            } while (root == null && !stack.empty());
        }
    }

    public List<Integer> preorderTraversalOptimal(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        if (root == null) return solution;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            root = stack.pop();
            solution.add(root.val);
            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }
        return solution;
    }
}
