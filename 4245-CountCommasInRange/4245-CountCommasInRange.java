// Last updated: 5/27/2026, 12:30:08 PM
class Solution {
    public int countCommas(int n) {
        long ans = 0;
        long base = 1000;
        while(base<=n){
            ans += n-base+1;
            base *= 1000;
        }
        return (int)ans;
    }
}