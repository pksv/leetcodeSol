package com.pksv.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    private void getQueue(TreeNode root, Map<Integer, List<Integer>> map, int level) {
        if (root == null) return;
        List<Integer> l = map.getOrDefault(level, new ArrayList<>());
        l.add(root.val);
        map.put(level, l);
        level++;
        getQueue(root.left, map, level);
        getQueue(root.right, map, level);
    }

    private List<Integer> print(Map<Integer, List<Integer>> q) {
        List<Integer> temp = new ArrayList<>();
        for (var l : q.keySet()) {
            temp.addAll(q.get(l));
        }
        return temp;
    }

    @Override
    public String toString() {
        Map<Integer, List<Integer>> nodeList = new TreeMap<>();
        getQueue(this, nodeList, 0);
        return print(nodeList).toString();
    }
}
