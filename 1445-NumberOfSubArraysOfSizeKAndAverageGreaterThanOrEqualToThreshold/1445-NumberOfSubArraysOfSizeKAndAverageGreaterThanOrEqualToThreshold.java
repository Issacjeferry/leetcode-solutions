// Last updated: 5/27/2026, 12:32:10 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int d) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int val = sum/k;
        int ans= 0;
        if(val>=d){
            ans++;
        }
        for(int i=1;i<arr.length-k+1;i++){
            sum = sum -arr[i-1]+arr[i+k-1];
            if((sum/k) >= d){
                ans++;
            }
        }
        return ans;
    }
}