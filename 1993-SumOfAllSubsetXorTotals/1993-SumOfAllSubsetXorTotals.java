// Last updated: 5/27/2026, 12:31:32 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            t=t|nums[i];
        }
        return t*(1<<(nums.length-1));
    }
}