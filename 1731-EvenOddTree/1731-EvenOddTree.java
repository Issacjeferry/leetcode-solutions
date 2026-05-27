// Last updated: 5/27/2026, 12:31:51 PM
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
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int n = q.size();
            int data = (i%2==0) ?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                TreeNode node = q.poll();
                if(i%2==0){
                    if(node.val%2==0 || node.val <= data) 
                        return false;
                    
                }else{
                    if(node.val%2!=0 || node.val>=data) 
                        return false;
                    
                }
                data = node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            i++;
        }
        return true;
    }
}