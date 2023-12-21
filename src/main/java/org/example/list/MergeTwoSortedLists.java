package org.example.list;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        var x = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode resultHead = result;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                resultHead.next = list2;
                list2 = list2.next;
            } else {
                resultHead.next = list1;
                list1 = list1.next;
            }
            resultHead = resultHead.next;
        }
        resultHead.next = list1 == null ? list2 : list1;
        return result.next;
    }
}
