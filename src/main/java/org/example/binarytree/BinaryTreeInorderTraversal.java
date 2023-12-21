package org.example.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        var root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(new BinaryTreeInorderTraversal().inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        inorderTraversal(root, sol);
        return sol;
    }

    public void inorderTraversal(TreeNode root, List<Integer> res) {
        if (root == null) return;
        inorderTraversal(root.left, res);
        res.add(root.val);
        inorderTraversal(root.right, res);
    }
}
