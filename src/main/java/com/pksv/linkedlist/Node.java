package com.pksv.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static Node generateNodes(Integer[]... nodes) {
        List<Node> temp = new ArrayList<>();
        Node head = new Node(0);
        Node pointer = head;
        for (int i = 0; i < nodes.length; i++) {
            Node n = new Node(nodes[i][0]);
            pointer.next = n;
            temp.add(n);
            pointer = pointer.next;
        }
        pointer = head.next;
        int i = 0;
        while (pointer != null) {
            if (nodes[i][1] != null) {
                pointer.random = temp.get(nodes[i][1]);
            }
            i++;
            pointer = pointer.next;
        }

        return head.next;
    }
}
