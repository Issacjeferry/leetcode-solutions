// Last updated: 5/27/2026, 12:30:47 PM
class Solution {
    public int findDelayedArrivalTime(int a, int b) {
        if(a+b<=23){
            return a+b;
        }
        if(a+b>24)
            return a+b-24;
       return 0;
    }
}