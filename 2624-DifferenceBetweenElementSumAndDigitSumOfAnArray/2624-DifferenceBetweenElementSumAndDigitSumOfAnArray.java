// Last updated: 5/27/2026, 12:30:53 PM
class Solution {
    int digit(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int asum=0;
        int bsum=0;
        for(int i:nums){
            asum+=i;
            bsum+=digit(i);
        }
        return asum-bsum;
    }
}