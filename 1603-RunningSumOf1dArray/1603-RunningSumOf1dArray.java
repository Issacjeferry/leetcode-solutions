// Last updated: 5/27/2026, 12:31:59 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int i=1;
        while(i < nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
        
    }
}