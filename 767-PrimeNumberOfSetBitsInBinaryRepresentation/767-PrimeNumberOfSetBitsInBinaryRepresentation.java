// Last updated: 5/27/2026, 12:33:16 PM
class Solution {
    int setBitCount(int n){
        int count=0;
        while(n!=0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int a,count=0;
        while(left<=right){
            a=setBitCount(left);
            if(a==2||a==3||a==5||a==7||a==11||a==13||a==17||a==19||a==23||a==29||a==31){
                count++;
            }
            left++;
        }
        return count;
    }
}