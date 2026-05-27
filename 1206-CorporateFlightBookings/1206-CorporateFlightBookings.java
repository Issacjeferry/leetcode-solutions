// Last updated: 5/27/2026, 12:32:26 PM
class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int diff[] = new int[n+1];
        int ans[] = new int[n];
        int st=0,ed=0,val;
        for(int i=0;i<arr.length;i++){
            st=arr[i][0]-1;
            ed=arr[i][1];
            val=arr[i][2];//1 based indexing
            diff[st]=diff[st]+val;
            //if(ed<=n-1)
            diff[ed]=diff[ed]-val;
        }
        ans[0]=diff[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+diff[i];
        }
        return ans;
        
    }
}