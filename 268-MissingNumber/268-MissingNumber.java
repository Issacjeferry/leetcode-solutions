// Last updated: 5/27/2026, 12:35:02 PM
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int index=nums[i];
            if(nums[i]!=nums.length && nums[i]!=nums[index] ){
                int t=nums[i];
                nums[i]=nums[index];
                nums[index]=t;
            }else 
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}