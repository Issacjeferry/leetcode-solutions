// Last updated: 5/27/2026, 12:33:34 PM
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
    Set<Integer> ans = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;

        if(ans.contains(k-root.val)) return true;

        else ans.add(root.val);

        return findTarget(root.left,k) || findTarget(root.right,k); 

    }
}