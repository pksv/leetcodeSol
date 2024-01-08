package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.printListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
//        ListNode head = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0)))));
//        ListNode head = new ListNode();
        var x = new RemoveDuplicatesFromSortedList().deleteDuplicatesSpaceOptimise(head.next);
        printListNode(x);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode result = new ListNode(head.val);
        ListNode resultPointer = result;
        while (head != null) {
            if (resultPointer.val != head.val) {
                resultPointer.next = head;
                resultPointer = resultPointer.next;
            }
            head = head.next;
        }
        resultPointer.next = null;
        System.gc();
        return result;
    }

    public ListNode deleteDuplicatesSpaceOptimise(ListNode head) {
        ListNode pointer = head;
        while (pointer != null && pointer.next != null) {
            if (pointer.val != pointer.next.val) {
                pointer = pointer.next;
            } else {
                pointer.next = pointer.next.next;
            }
        }
        System.gc();
        return head;
    }
}
