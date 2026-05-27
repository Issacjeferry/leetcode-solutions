// Last updated: 5/27/2026, 12:34:18 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for(int num:nums){
            left = Math.max(left,num);
            right+=num;
        }

        while(left<right){
            int mid = left + (right-left) / 2;
            if(split(nums,k,mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public boolean split(int[] nums,int k,int maxsum){
        int subarray = 1;
        int currentsum =0;
        for(int num:nums){
            if(currentsum+num > maxsum){
                subarray++;
                currentsum=num;
                if(subarray > k){
                    return false;
                }
            }else{
                currentsum +=num;
            }
        }
        return true;
    }
}