package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.getListNode;
import static com.pksv.linkedlist.ListNode.printListNode;

public class MiddleLinkedList {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        var head = getListNode(x);
        var y = new MiddleLinkedList().middleNode(head);
        printListNode(y);
    }

    public ListNode middleNode(ListNode head) {
        ListNode listNodeSlow = head;
        ListNode listNodeFast = head;
        while (listNodeFast != null && listNodeFast.next != null) {
            listNodeSlow = listNodeSlow.next;
            listNodeFast = listNodeFast.next.next;
        }
        return listNodeSlow;
    }
}
