// Last updated: 5/27/2026, 12:32:04 PM
class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum=sum-arr[k-i-1]+ arr[n-i-1];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}