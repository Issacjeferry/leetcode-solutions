// Last updated: 5/27/2026, 12:35:00 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]!=0){
                int t=nums[left];
                nums[left] = nums[right];
                nums[right]=t;
                left++;

            }
            right++;
        }
    }
}