package com.pksv.tree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromDescriptions {

    public static void main(String[] args) {
//        int[][] descriptions = {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}};
        int[][] descriptions = {{85, 82, 1}, {74, 85, 1}, {39, 70, 0}, {82, 38, 1}, {74, 39, 0}, {39, 13, 1}};
        System.out.println(new BinaryTreeFromDescriptions().createBinaryTree(descriptions));
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        TreeNode root = null;
        for (var desc : descriptions) {
            nodeMap.put(desc[1], new TreeNode(desc[1]));
        }

        for (var desc : descriptions) {
            if (!nodeMap.containsKey(desc[0])) {
                root = new TreeNode(desc[0]);
                nodeMap.put(desc[0], root);
            }
            if (desc[2] == 1) nodeMap.get(desc[0]).left = nodeMap.get(desc[1]);
            else nodeMap.get(desc[0]).right = nodeMap.get(desc[1]);
        }
        return root;
    }
}
