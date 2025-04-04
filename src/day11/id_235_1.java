package day11;

public class id_235_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x = root.val;
        if(p.val < x && q.val < x){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val > x && q.val > x){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
