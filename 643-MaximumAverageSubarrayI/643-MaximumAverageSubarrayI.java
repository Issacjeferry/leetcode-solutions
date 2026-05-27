// Last updated: 5/27/2026, 12:33:37 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg = sum;
        for(int i=1;i<nums.length-k+1;i++){
            sum = sum - nums[i-1] +nums[i+k-1];
            if(avg<sum){
                avg=sum;
            }
        }
        return (double)avg/k;
    }
}

//find the maxsum then divide it by the k