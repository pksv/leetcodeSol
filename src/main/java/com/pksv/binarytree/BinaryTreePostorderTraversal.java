package com.pksv.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(
                        3,
                        null,
                        new TreeNode(6)
                )
        );

        System.out.println(Arrays.toString(new BinaryTreePostorderTraversal().postorderTraversal(root).toArray()));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        if (root == null) return solution;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            root = stack.pop();
            solution.add(0, root.val);
            if (root.left != null) stack.push(root.left);
            if (root.right != null) stack.push(root.right);
        }
        return solution;
    }

}
