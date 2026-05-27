// Last updated: 5/27/2026, 12:33:40 PM
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int len=0;
        int left=0,right=1;
        while(right<n){
            while(nums[right]-nums[left] > 1 && left<right){
                left++;
            }
            if(nums[right]-nums[left] == 1){
                len = Math.max(len,right-left+1);
            }
            
            right++;
        }
        return len;
    }
}
