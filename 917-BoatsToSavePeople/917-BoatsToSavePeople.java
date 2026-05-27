// Last updated: 5/27/2026, 12:32:54 PM
class Solution {
    public int numRescueBoats(int[] arr, int k) {
        int l=0, r=arr.length-1;
        int c=0;
        Arrays.sort(arr);
        while(l<=r){
            if(arr[l]+arr[r]<=k){
                c++;
                l++;
                r--;
            }else{
                c++;
                r--;
            }
        }
        return c;
        
    }
}