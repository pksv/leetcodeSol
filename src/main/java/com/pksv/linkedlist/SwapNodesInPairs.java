package com.pksv.linkedlist;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = ListNode.generateLinkedList(1);
        System.out.println(new SwapNodesInPairs().swapPairs(head));
    }

    public ListNode swapPairs(ListNode head) {
        ListNode root = head;
        while (root != null && root.next != null) {
            root.val = root.val + root.next.val - (root.next.val = root.val);
            root = root.next.next;
        }
        return head;
    }
}
