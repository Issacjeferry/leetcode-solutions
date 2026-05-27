// Last updated: 5/27/2026, 12:31:28 PM
class Solution {
    public boolean isThree(int n) {
        if(n==0||n==1||n==2||n==3) return false;
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
            if(c>3){
                return false;
            }
        }
        if(c==3)
            return true;
        else
            return false;    

    }
}