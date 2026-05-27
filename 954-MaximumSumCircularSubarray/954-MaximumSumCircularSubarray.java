// Last updated: 5/27/2026, 12:32:50 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min=nums[0],min_res=nums[0];
        int max=nums[0],max_res=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max+nums[i],nums[i]);
            max_res = Math.max(max,max_res);
            min=Math.min(nums[i],min+nums[i]);
            min_res=Math.min(min,min_res);
            sum+=nums[i];
        }

        if(max_res<0) return max_res;
        return Math.max(max_res,sum-min_res);
        
    }
}