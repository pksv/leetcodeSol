package com.pksv.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 *             1
 *       3          2
 *   4   5   6    7   8
 *
 */
public class Sample {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.children.addAll(List.of(new Node(3), new Node(2)));

        root.children.getFirst().children.add(new Node(4));
        root.children.getFirst().children.add(new Node(5));
        root.children.getFirst().children.add(new Node(6));
        root.children.getLast().children.add(new Node(7));
        root.children.getLast().children.add(new Node(8));
        Map<Integer, List<Node>> nodeList = new TreeMap<>();
        int level = 0;
        nodeList.put(level, List.of(root));
        getQueue(root, nodeList, level + 1);
        print(nodeList);
    }


    private static void getQueue(Node root, Map<Integer, List<Node>> map, int level) {
        List<Node> l = map.getOrDefault(level, new ArrayList<>());
        l.addAll(root.children);
        map.put(level, l);
        level++;
        for (var x : root.children) {
            getQueue(x, map, level);
        }
    }

    private static void print(Map<Integer, List<Node>> q) {
        for (var l : q.keySet()) {
            var x = q.get(l);
            for (var y : x) {
                System.out.print(y.val + " ");
            }
        }
    }
}
