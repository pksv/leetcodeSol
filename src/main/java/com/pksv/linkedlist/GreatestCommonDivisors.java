package com.pksv.linkedlist;

// Insert Greatest Common Divisors in Linked List
public class GreatestCommonDivisors {
    public static void main(String[] args) {
        ListNode head = ListNode.generateLinkedList(18, 6, 10, 3);
//        ListNode head = ListNode.generateLinkedList(7);
        System.out.println(new GreatestCommonDivisors().insertGreatestCommonDivisors(head));
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        while (second != null) {
            int min = Math.min(first.val, second.val);
            int max = Math.max(first.val, second.val);
            while (max != 0) {
                int temp = max;
                max = min % max;
                min = temp;
            }
            first.next = new ListNode(min, second);
            first = second;
            if (second.next != null)
                second = second.next;
            else break;
        }
        return head;
    }
}
