package com.pksv.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        node2.next = new ListNode(-4, node1);
        ListNode head = new ListNode(3, node1);
        System.out.println(new LinkedListCycle().hasCycleOptimal(head));
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        while (head != null) {
            if (listNodes.contains(head)) {
                System.gc();
                return true;
            }
            listNodes.add(head);
            head = head.next;
        }
        System.gc();
        return false;
    }

    public boolean hasCycleOptimal(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next, slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
