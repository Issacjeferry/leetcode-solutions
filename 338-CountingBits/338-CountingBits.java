// Last updated: 5/27/2026, 12:34:39 PM
class Solution {
    public int[] countBits(int n) {
        int[]ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i]=Integer.bitCount(i);
        }
        return ans;
    }
}