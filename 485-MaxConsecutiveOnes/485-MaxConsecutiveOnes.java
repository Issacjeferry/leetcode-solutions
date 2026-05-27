// Last updated: 5/27/2026, 12:34:03 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=0) {
                c++;
            }else{
                System.out.print(c+" ");
                max=Math.max(max,c);
                c=0;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}