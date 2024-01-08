package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.getListNode;
import static com.pksv.linkedlist.ListNode.printListNode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        int[] s = {1, 2, 6, 3, 4, 5, 6};
        var x = getListNode(s);
        printListNode(new RemoveLinkedListElements().removeElements(x, 6));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        while (head != null) {
            if (head.val != val) {
                pointer.next = head;
                pointer = pointer.next;
            } else pointer.next = null;
            head = head.next;
        }
        return result.next;
    }
}
