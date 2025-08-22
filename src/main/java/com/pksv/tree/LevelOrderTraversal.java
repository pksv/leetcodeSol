package com.pksv.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );
        System.out.println(new LevelOrderTraversal().levelOrder(root));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> elements = new ArrayList<>();
        helper(root, 0, elements);
        return elements;
    }

    public void helper(TreeNode root, int level, List<List<Integer>> elements) {
        if (root == null) return;
        while (elements.size() <= level) elements.add(new ArrayList<>());
        elements.get(level).add(root.val);
        helper(root.left, level + 1, elements);
        helper(root.right, level + 1, elements);
    }
}
