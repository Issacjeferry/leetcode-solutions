// Last updated: 5/27/2026, 12:33:46 PM
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
     int ans=0;
     int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int a = height(root.left);
        int b = height(root.right);

        ans=Math.max(ans,a+b);
        return Math.max(a,b)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int a= height(root);
        return ans;
    }
}