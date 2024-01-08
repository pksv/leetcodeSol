package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.getListNode;
import static com.pksv.linkedlist.ListNode.printListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        printListNode(new ReverseLinkedList().reverseList(getListNode(i)));
    }

    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        while (head != null) {
            var temp = result.next;
            result.next = new ListNode(head.val, temp);
            head = head.next;
        }
        return result.next;
    }
}
