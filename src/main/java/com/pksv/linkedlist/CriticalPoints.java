package com.pksv.linkedlist;

import java.util.Arrays;

import static com.pksv.linkedlist.ListNode.generateLinkedList;

//Find the Minimum and Maximum Number of Nodes Between Critical Points
public class CriticalPoints {
    public static void main(String[] args) {
//        int[] arr = {5, 3, 1, 2, 5, 1, 2};
        ListNode head = generateLinkedList(2, 3, 3, 2);
        System.out.println(Arrays.toString(new CriticalPoints().nodesBetweenCriticalPoints(head)));
    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min = 0;
        int start = 0;
        int end = 0;
        int counter = 1;
        int[] result = {Integer.MAX_VALUE, -1};
        ListNode pointer = head.next;
        ListNode prev = head;
        while (pointer.next != null) {
            if ((prev.val < pointer.val && pointer.val > pointer.next.val)
                    || (prev.val > pointer.val && pointer.val < pointer.next.val)) {
                if (min != 0) result[0] = Math.min(result[0], counter - min);
                if (start == 0) start = counter;
                else end = counter;
                min = counter;
            }
            prev = prev.next;
            pointer = pointer.next;
            counter++;
        }

        if (result[0] != Integer.MAX_VALUE) {
            result[1] = end - start;
        } else result[0] = -1;
        return result;
    }
}
