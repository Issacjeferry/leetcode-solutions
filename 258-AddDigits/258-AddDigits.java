// Last updated: 5/27/2026, 12:35:05 PM
class Solution {
    public int addDigits(int n) {
        if(n==0)
            return 0;
        if(n%9==0)
            return 9;
        else
            return(n%9);    
    }
}







