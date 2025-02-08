package com.pksv.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {

    }

    public Node(int v) {
        val = v;
        children = new ArrayList<>();
    }

    public Node(int v, List<Node> n) {
        val = v;
        children = n;
    }
}

