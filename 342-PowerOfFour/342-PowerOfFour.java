// Last updated: 5/27/2026, 12:34:35 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        while(n%4==0){
            n=n/4;
        }
        return n==1;    
    }
}