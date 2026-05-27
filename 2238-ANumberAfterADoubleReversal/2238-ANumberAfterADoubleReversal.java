// Last updated: 5/27/2026, 12:31:16 PM
class Solution {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int la=n%10;
            rev=rev*10+la;
            n=n/10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int a1=reverse(num);
        int a2=reverse(a1);
        if(a2==num){
            return true;
        }else{
            return false;
        }
        
    }
}