// Last updated: 5/27/2026, 12:32:45 PM
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
    int sum=0;
    void rangeSum(TreeNode root,int low,int high){
        if(root==null){
            return;
        }
        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        rangeSum(root.left,low,high);
        rangeSum(root.right,low,high);

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSum(root,low,high);
        return sum;
        
    }
}