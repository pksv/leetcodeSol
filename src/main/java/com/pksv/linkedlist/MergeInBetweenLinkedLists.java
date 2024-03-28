package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.getListNode;
import static com.pksv.linkedlist.ListNode.printListNode;

public class MergeInBetweenLinkedLists {

    public static void main(String[] args) {
        int[] l1 = {0, 1, 2, 3, 4, 5, 6};
        int[] l2 = {1000000, 1000001, 1000002, 1000003, 1000004};
        int a = 2, b = 5;
        var y = new MergeInBetweenLinkedLists();
        var x = y.mergeInBetween(getListNode(l1), a, b, getListNode(l2));
        printListNode(x);
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int pos = 0;
        ListNode temp = list1;
        ListNode mid = temp;
        while (pos < b) {
            if (pos++ < a - 1) temp = temp.next;
            mid = mid.next;
        }
        temp.next = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = mid.next;
        return list1;
    }
}
