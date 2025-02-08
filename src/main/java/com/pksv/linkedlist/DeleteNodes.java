package com.pksv.linkedlist;

import java.util.HashSet;
import java.util.Set;

//Delete Nodes From Linked List Present in Array
public class DeleteNodes {
    public static void main(String[] args) {
        int[] nums = {5/*1, 2, 3*/};
//        ListNode head = ListNode.generateLinkedList(1, 2, 3, 4, 5);
//        ListNode head = ListNode.generateLinkedList(1, 2, 1, 2, 1, 2);
        ListNode head = ListNode.generateLinkedList(1, 2, 3, 4);
        System.out.println(new DeleteNodes().modifiedList(nums, head));
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> n = new HashSet<>();
        for (var num : nums) {
            n.add(num);
        }

        ListNode nodes = head;
        while (nodes.next != null) {
            if (n.contains(nodes.next.val)) {
                nodes.next = nodes.next.next;
            } else nodes = nodes.next;
        }

        return n.contains(head.val) ? head.next : head;
    }
}
