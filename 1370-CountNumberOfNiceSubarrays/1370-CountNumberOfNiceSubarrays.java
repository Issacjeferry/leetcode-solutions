// Last updated: 5/27/2026, 12:32:19 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left=0,right=0;
        int c=0,codd=0;
        while(right<nums.length){
            if(nums[right]%2!=0) codd++;
            while(codd>k){
                if(nums[left]%2!=0) codd--;
                left++;
            }
            if(codd==k){
                int t=left;
                while(nums[t]%2==0){
                    c++;
                    t++;
                }
                c++;
            }

            right++;
        }
        return c;
    }
}