package com.pksv.others_or_repeated;

public class LargestSubtreeSum {
    private int ans = Integer.MIN_VALUE;

    public static void main(String[] args) {
        LargestSubtreeSum ls = new LargestSubtreeSum();
        Node root = ls.newNode(1);
        root.left = ls.newNode(-2);
        root.right = ls.newNode(3);
        root.left.left = ls.newNode(4);
        root.left.right = ls.newNode(5);
        root.right.left = ls.newNode(-6);
        root.right.right = ls.newNode(2);

        System.out.println(ls.findLargestSubtreeSum(root));
    }


    Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    private int dfs(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.key;
        // check for every subtree in left
        int sumleft = dfs(root.left);
        // check for every subtree in right
        int sumright = dfs(root.right);
        // sum of all the nodes in the subtree from root
        // node
        int sumrootnode = sumleft + sumright + root.key;
        // temp max value of left and right subtree
        int max = Math.max(sumleft, Math.max(sumright, sumrootnode));

        // update the answer from temp, ans
        ans = Math.max(ans, max);

        return sumrootnode;
    }

    private int findLargestSubtreeSum(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.key;
        // function call of dfs
        dfs(root);
        // return the final answer
        return ans;
    }
}

class Node {
    public int key;
    public Node left, right;
}
