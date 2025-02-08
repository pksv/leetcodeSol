package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.generateLinkedList;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode[] lists = {generateLinkedList(1, 4, 5),
                generateLinkedList(1, 3, 4),
                generateLinkedList(2, 6)};
        System.out.println(new MergeKSortedLists().mergeKLists(lists));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode node = head;
        while (true) {
            int i = 0;
            int min = Integer.MAX_VALUE;
            for (var l : lists) {
                if (l != null) {
                    min = Math.min(min, l.val);
                } else i++;
            }
            if (i == lists.length) {
                break;
            }
            int count = 0;
            for (int j = 0; j < lists.length; j++) {
                if (lists[j] != null)
                    if (lists[j].val == min) {
                        lists[j] = lists[j].next;
                        count++;
                    }
            }
            while (count-- > 0) {
                node.next = new ListNode(min);
                node = node.next;
            }
        }
        return head.next;
    }
}
