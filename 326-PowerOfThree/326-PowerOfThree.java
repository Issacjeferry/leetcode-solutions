// Last updated: 5/27/2026, 12:34:43 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}