package com.pksv.linkedlist;

public class PalindromeLinkedList {
    public static void main(String[] args) {
//        var head = ListNode.getListNode(new int[]{1, 2, 2, 1});
        var head = ListNode.getListNode(new int[]{1, 2});
        System.out.println(new PalindromeLinkedList().isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (head != null) {
            s1.append(head.val);
            s2.insert(0, head.val);
            head = head.next;
        }
        return s1.compareTo(s2) == 0;
    }

    public boolean isPalindrome1(ListNode head) {
        ListNode slow = head, fast = head;

        // find middle (slow)
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // check if palindrome
        ListNode left = head, right = prev;
        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
}
