// Last updated: 5/27/2026, 12:32:28 PM
class Solution {
    public boolean carPooling(int[][] arr, int c) {
        int diff[] = new int[1001];
        
        for(int i=0;i<arr.length;i++){
            int st=arr[i][1];
            int ed=arr[i][2];
            int val=arr[i][0];
            diff[st]+=val;
            diff[ed]-=val;
        }
        // int ans[] = new int[diff.length];
        // ans[0]=diff[0];
        int ans=diff[0];
        for(int i=1;i<diff.length;i++){
            if(ans>c){
                return false;
            }
            ans+=diff[i];
        }
        return true;
        
    }
}