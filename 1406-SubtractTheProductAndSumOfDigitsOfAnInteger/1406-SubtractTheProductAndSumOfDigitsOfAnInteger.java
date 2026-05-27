// Last updated: 5/27/2026, 12:32:18 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n!=0){
            int ld=n%10;
            sum+=ld;
            pro*=ld;
            n=n/10;
        }
        return pro-sum;
    }
}