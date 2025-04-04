package day9;

public class id_101_1 {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        return p.val == q.val && isSameTree(p.left, q.right) && isSameTree(p.left, q.right);
    }


}
