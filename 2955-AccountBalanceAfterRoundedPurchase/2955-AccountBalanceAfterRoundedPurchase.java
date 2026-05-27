// Last updated: 5/27/2026, 12:30:36 PM
class Solution {
    public int accountBalanceAfterPurchase(int n) {
        if(n<5){
            return 100;
        }
        if(n<=5&&n>=9){
            return 100-10;
        }
        if(n%10>=5){
            return 100-(n/10+1)*10;
        }
        return 100-(n/10)*10;
        
    }
}