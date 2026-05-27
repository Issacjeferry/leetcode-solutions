// Last updated: 5/27/2026, 12:31:49 PM
class Solution {

    public int minimal(int[] nums,int x){
        int n = nums.length;
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        if(sum < x){
            return -1;
        }
        int target = sum - x;
        int left = 0;
        int total = 0;
        int maxlen = -1;
        for(int r=0;r<n;r++){
            total+=nums[r];
            while(left <=r && total>target){
                total-=nums[left];
                left++;
            }
            if(total==target){
                maxlen = Math.max(maxlen,r-left+1);
            }
        }
        if(maxlen == -1){
                return -1;
            }
        return n-maxlen;

    }
    public int minOperations(int[] nums, int x) {
        return minimal(nums,x);
    }
}