// Last updated: 5/27/2026, 12:35:24 PM
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
    int c=0;
    int data = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return data;
    }
    public void dfs(TreeNode root,int k){
        if(root==null) return;
       
        dfs(root.left,k);
        if(++c==k){
            data = root.val;
        }
        dfs(root.right,k);
    }
}