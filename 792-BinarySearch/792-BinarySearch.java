// Last updated: 5/27/2026, 12:33:11 PM
class Solution {
    public int search(int[] nums, int t) {
        int n =nums.length;
        int low=0,high = n-1,mid;
        while(low<=high){
            mid =(low+high)/2;
            if(nums[mid]==t){
                return mid;
            }else if(nums[mid] > t){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}