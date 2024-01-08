package com.pksv.linkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNode(int[] list) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        for (var x : list) {
            pointer.next = new ListNode(x);
            pointer = pointer.next;
        }
        return head.next;
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
