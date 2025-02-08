package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.generateLinkedList;

public class MergeNodesBetweenZeros {
    public static void main(String[] args) {
//        int[] arr = {0, 3, 1, 0, 4, 5, 2, 0};
        ListNode head = generateLinkedList(0, 1, 0, 3, 0, 2, 2, 0);
        System.out.println(new MergeNodesBetweenZeros().mergeNodes(head));
    }

    public ListNode mergeNodes(ListNode head) {
        ListNode result = head;
        ListNode pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next;
            if (pointer.val == 0) {
                if (pointer.next == null) {
                    result.next = null;
                    break;
                }
                result = result.next;
                result.val = 0;
            } else result.val += pointer.val;
        }
        return head;
    }
}
