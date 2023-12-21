package org.example.binarytree;

public class SameTree {
    public static void main(String[] args) {
        var p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//        var p = new TreeNode(1, new TreeNode(2), null);
        var q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//        var q = new TreeNode(1, null, new TreeNode(2));
        System.out.println(new SameTree().isSameTree(p, q));
    }

//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        boolean result = true;
//        result = isSameTree(p, q, result);
//        return result;
//    }
//
//    private boolean isSameTree(TreeNode p, TreeNode q, boolean result) {
//        if ((p == null && q != null) || (p != null && q == null)) return false;
//        if (p != null && q != null) {
//            if (result && p.val == q.val) {
//                result = isSameTree(p.left, q.left, result);
//                if (result)
//                    result = isSameTree(p.right, q.right, result);
//            } else return false;
//        }
//        return result;
//    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
