// Last updated: 5/27/2026, 12:35:20 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || p==null || q==null){
            return null;
        }
        if(p.val<root.val && q.val<root.val){
            return ans(root.left,p,q);
        }else if(p.val>root.val && q.val>root.val){
            return ans(root.right,p,q);
        }else
            return root;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return ans(root,p,q);
        
    }
}