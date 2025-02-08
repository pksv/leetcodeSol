package com.pksv.linkedlist;

public class CopyList {
    public static void main(String[] args) {
        Integer[][] h = {{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}};
        Node head = Node.generateNodes(h);
        Node copy = new CopyList().copyRandomList(head);
        System.out.println(copy.val);
    }

    public Node copyRandomList(Node head) {
        Node pointer = head;
        while (pointer != null) {
            Node newNode = new Node(pointer.val);
            newNode.next = pointer.next;
            pointer.next = newNode;
            pointer = pointer.next.next;
        }

        pointer = head;
        while (pointer != null) {
            if (pointer.random != null) {
                pointer.next.random = pointer.random.next;
            }
            pointer = pointer.next.next;
        }

        Node copy = new Node(0);
        Node copyPointer = copy;
        pointer = head;

        while (pointer != null) {
            copyPointer.next = pointer.next;
            copyPointer = copyPointer.next;
            pointer.next = pointer.next.next;
            copyPointer.next = null;
            pointer = pointer.next;
        }
        return copy.next;
    }
}
