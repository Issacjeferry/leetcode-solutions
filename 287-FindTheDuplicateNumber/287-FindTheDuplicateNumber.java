// Last updated: 5/27/2026, 12:34:58 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int idx=nums[i]-1;
            if(nums[i]!=nums[idx]){
                int t=nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;
            }
            else
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return 0;
        
    }
}