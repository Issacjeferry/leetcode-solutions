// Last updated: 5/27/2026, 12:32:51 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int low=0,high=0;
        while(high<nums.length){
            if(nums[high]%2==0){
                    int t=nums[low];
                    nums[low]=nums[high];
                    nums[high]=t;
                    low++;
            }
            high++;
        }
        return nums;
    }
}