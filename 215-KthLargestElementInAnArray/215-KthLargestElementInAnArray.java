// Last updated: 5/27/2026, 12:35:36 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];        
    }
}