// Last updated: 5/27/2026, 12:30:48 PM
class Solution {
    public int kItemsWithMaximumSum(int a, int b, int c, int k) {
        if(k<=a){
            return k;
        }      
        if(k>a){
            if(a+b>k){
                return (a*1);
            }
            c=k-(a+b);
            return (a*1)+(b*0)+(c*-1);
        }
        return 0;
    }
}