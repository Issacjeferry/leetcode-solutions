// Last updated: 5/27/2026, 12:30:41 PM
class Solution {
    public int longestAlternatingSubarray(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0) continue;
            if(nums[i]>k) continue;
            int l=1;
            for(int j=i+1;j<n;j++){
                if(nums[j] > k) break;
                if((nums[j] %2) == (nums[j-1]%2)) break;
                l++;
            }
            max=Math.max(max,l);
        }
        return max;
    }
}