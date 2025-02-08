package com.pksv.others_or_repeated.linkedlist;

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

    public static ListNode generateLinkedList(int... arr) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        for (int num : arr) {
            pointer.next = new ListNode(num);
            pointer = pointer.next;
        }
        return head.next;
    }

    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (head != null) {
            builder.append(head.val).append(", ");
            head = head.next;
        }
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
