// Last updated: 5/27/2026, 12:31:11 PM
class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=0;
        int n=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int diff=Math.abs(nums[i]);
            int  val=nums[i];
            if(diff<n){
                ans=val;
                n=diff;
            }
            if(n==diff && val>ans){
                ans=val;
            }
        }
        return ans;
    }
}