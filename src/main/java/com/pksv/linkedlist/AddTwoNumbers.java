package com.pksv.linkedlist;

import static com.pksv.linkedlist.ListNode.generateLinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = generateLinkedList(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = generateLinkedList(9, 9, 9, 9);
        System.out.println(new AddTwoNumbers().addTwoNumbers(l1, l2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode sol = new ListNode();
        ListNode pointer = sol;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
        }
        if (carry != 0)
            pointer.next = new ListNode(carry);
        return sol.next;
    }
}
