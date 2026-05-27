// Last updated: 5/27/2026, 12:32:42 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int start=0,end=nums.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(nums[start]) >= Math.abs(nums[end])){
                arr[i] = nums[start] * nums[start];
                start++;
            }else{
                arr[i] = nums[end] * nums[end];
                end--;
            }
        }
        return arr;
    }
}