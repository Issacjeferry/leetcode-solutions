// Last updated: 5/27/2026, 12:35:40 PM
class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int n=nums.length;
        int sum=0;
        int len=Integer.MAX_VALUE;
        int left=0,right=0;
        boolean a =false;
        while(right<n){
            sum=sum+nums[right];
            while(sum>=t){
                a=true;
                len = Math.min(len,right-left+1);
                sum = sum - nums[left];
                left++;
            }
           
            right++;
        }
        if(a){
            return len;
        }else 
            return 0;

    }
}