// Last updated: 1/26/2026, 4:33:06 PM
class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
    }
}