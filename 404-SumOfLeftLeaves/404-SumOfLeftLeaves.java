// Last updated: 5/27/2026, 12:34:19 PM
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
    static int sum;
    static void dfs(TreeNode root,boolean left){
        if(root==null) 
            return;
        if(root.left==null && root.right==null && left==true){
            sum+=root.val;
        } 
        dfs(root.left,true);
        dfs(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        dfs(root,false);

        return sum;
    }
}