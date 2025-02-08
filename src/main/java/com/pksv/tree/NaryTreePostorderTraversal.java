package com.pksv.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(
                1,
                List.of(
                        new Node(
                                3,
                                List.of(
                                        new Node(5),
                                        new Node(6)
                                )
                        ),
                        new Node(2),
                        new Node(4)
                )
        );

        Node root1 = new Node();
        System.out.println(new NaryTreePostorderTraversal().postorder(root1));
    }

    public List<Integer> postorder(Node root) {
        List<Integer> sol = new ArrayList<>();
        iterative(root, sol);
        return sol;
    }

    private void recursive(Node root, List<Integer> sol) {
        if (root == null) return;
        for (var child : root.children) {
            recursive(child, sol);
        }
        sol.add(root.val);
    }

    private void iterative(Node root, List<Integer> sol) {
        Stack<Node> stack = new Stack<>();
        if (root == null) return;
        stack.add(root);
        while (!stack.empty()) {
            var node = stack.pop();
            sol.addFirst(node.val);
            if (node.children != null && !node.children.isEmpty())
                stack.addAll(node.children);
        }
    }
}
