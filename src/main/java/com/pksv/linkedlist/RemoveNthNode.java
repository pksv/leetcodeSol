package com.pksv.linkedlist;


//Remove Nth Node From End of List
public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode head = ListNode.generateLinkedList(new int[]{1, 2});
        System.out.println(new RemoveNthNode().removeNthFromEnd(head, 1));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = head;

        for (int i = 0; i < n; i++) {
            node1 = node1.next;
        }

        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        node2.next = node2.next.next;

        return head;
    }

    public ListNode removeNthFromEndSol(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;
    }
}
