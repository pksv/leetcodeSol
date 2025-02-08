package com.pksv.linkedlist;

import java.util.ArrayList;

//Reverse Nodes in k-Group
public class ReverseNodes {
    public static void main(String[] args) {
        ListNode head = ListNode.generateLinkedList(1, 2, 3, 4, 5);
        int k = 3;
        System.out.println(new ReverseNodes().reverseKGroup(head, k));
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = new ListNode();
        ListNode temp = node;
        ListNode last = head;
        while (last != null) {
            ArrayList<ListNode> list = new ArrayList<>();
            int i = 0;
            while (i < k && last != null) {
                ListNode n = last;
                last = last.next;
                n.next = null;
                list.addFirst(n);
                i++;
            }
            if (i != k) {
                while (!list.isEmpty()) {
                    temp.next = list.removeLast();
                    temp = temp.next;
                }
                break;
            }
            while (i-- > 0) {
                temp.next = list.removeFirst();
                temp = temp.next;
            }
        }
        return node.next;
    }

    public ListNode reverseKGroupDef(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode nodeK = getKthNode(temp, k);
            if (nodeK == null) {
                if (prev != null) {
                    prev.next = temp;
                }
                break;
            }
            ListNode next = nodeK.next;
            nodeK.next = null;
            reverseList(temp);

            if (temp == head) {
                head = nodeK;
            } else {
                prev.next = nodeK;
            }

            prev = temp;
            temp = next;
        }

        return head;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    private ListNode getKthNode(ListNode head, int k) {
        int c = 1;
        while (head != null && c < k) {
            head = head.next;
            c++;
        }
        return head;
    }
}
