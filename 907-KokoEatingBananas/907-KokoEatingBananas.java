// Last updated: 5/27/2026, 12:32:57 PM
class Solution {
    public int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
    public int fun(int arr[] , int mid){
        int tot = 0;
        for(int i=0;i<arr.length;i++){
            tot+=Math.ceil((double)arr[i]/(double)mid);
        }
        return tot;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int a = max(arr);
        int low=1,high =a,mid;
        int min=Integer.MIN_VALUE;
        while(low<=high){
           mid =(low+high)/2;
           int tothr = fun(arr,mid);
           if(tothr <= h){
            min = tothr;
            high = mid-1;
           }else{
            low = mid+1;
           }
        }
        return low;
    }
}