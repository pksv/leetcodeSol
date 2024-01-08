package com.pksv.linkedlist;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode j = new ListNode(
                8,
                new ListNode(
                        4,
                        new ListNode(5)
                )
        );

        ListNode headA = new ListNode(
                4,
                new ListNode(
                        1,
                        j
                )
        );

        ListNode headB = new ListNode(
                5,
                new ListNode(
                        6,
                        new ListNode(
                                1,
                                j
                        )
                )
        );

        System.out.println(new IntersectionOfTwoLinkedLists().getIntersectionNode(headA, headB).val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int aCount = 0;
        int bCount = 0;
        while (a != null) {
            aCount++;
            a = a.next;
        }
        while (b != null) {
            bCount++;
            b = b.next;
        }
        while (aCount > bCount) {
            aCount--;
            headA = headA.next;
        }
        while (bCount > aCount) {
            bCount--;
            headB = headB.next;
        }
        while (headB != headA) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

        /*Set<ListNode> a = new HashSet<>();
        Set<ListNode> b = new HashSet<>();
        while (true) {
            if (headA == null && headB == null) return null;
            if (headA == headB) return headA;
            if (a.contains(headB)) return headB;
            if (b.contains(headA)) return headA;
            a.add(headA);
            b.add(headB);
            if (headA != null) headA = headA.next;
            if (headB != null) headB = headB.next;
        }*/
    }
}
