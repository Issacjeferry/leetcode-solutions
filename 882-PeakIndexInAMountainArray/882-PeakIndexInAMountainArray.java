// Last updated: 5/27/2026, 12:33:02 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low =0 ,high = n-1,mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[mid-1]){
                low = mid;
            }else{
                high = mid
                ;
            }
        }
        return 0;

    }
}