// Last updated: 1/26/2026, 4:32:07 PM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if(p % 10 > 4){
            p += 10 - p % 10;
        }
        else{
            p-=p%10;
        }
        return 100-p;
    }
}