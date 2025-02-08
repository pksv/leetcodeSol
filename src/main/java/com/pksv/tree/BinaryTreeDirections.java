package com.pksv.tree;

public class BinaryTreeDirections {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(
                        1,
                        new TreeNode(3),
                        null
                ),
                new TreeNode(
                        2,
                        new TreeNode(6),
                        new TreeNode(4)
                )
        );
        String path = new BinaryTreeDirections().getDirections(root, 3, 6);
        System.out.println(path);
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();

        findPath(root, startValue, s);
        findPath(root, destValue, d);

        int i = 0;
        int min = Math.min(s.length(), d.length());
        while (i < min && s.charAt(s.length() - i - 1) == d.charAt(d.length() - i - 1)) {
            ++i;
        }
        return "U".repeat(s.length() - i) + d.reverse().substring(i);
    }

    private boolean findPath(TreeNode root, int value, StringBuilder builder) {
        if (root.val == value)
            return true;

        if (root.left != null && findPath(root.left, value, builder))
            builder.append("L");
        else if (root.right != null && findPath(root.right, value, builder))
            builder.append("R");

        return !builder.isEmpty();
    }
}
