// Last updated: 5/27/2026, 12:33:24 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int total=0,leftsum=0,rightsum=0;
        for(int i:nums){
            total+=i;
        }
        for(int i=0;i<n;i++){
            rightsum=total-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;        
    }
}