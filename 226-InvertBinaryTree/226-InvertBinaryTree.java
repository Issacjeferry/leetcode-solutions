// Last updated: 5/27/2026, 12:35:28 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode invert(TreeNode p){
        if(p==null){
            return null;
        }
        TreeNode t=p.left;
        p.left=p.right;
        p.right=t;
        invert(p.left);
        invert(p.right);
        return p;

    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        return invert(root);
        
    }
}