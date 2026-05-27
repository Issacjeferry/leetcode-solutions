// Last updated: 5/27/2026, 12:33:39 PM
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        TreeNode x;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            Double sum=0.0;
            for(int i=0;i<n;i++){
                x=q.poll();
                sum+=x.val;
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            ans.add(sum/n);
        }
        return ans;
    }
}