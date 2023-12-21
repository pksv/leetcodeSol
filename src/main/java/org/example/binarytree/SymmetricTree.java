package org.example.binarytree;

public class SymmetricTree {
    public static void main(String[] args) {
        /*var root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)));*/
        var root = new TreeNode(
                1,
                new TreeNode(2,
                        null,
                        new TreeNode(3)),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)));
        System.out.println(new SymmetricTree().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
    }
}
