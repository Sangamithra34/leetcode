// Last updated: 1/26/2026, 4:33:26 PM
class Solution {
    public int trailingZeroes(int n) {
    int res = 0;
    while (n > 0) {
        n /= 5;
        res += n;
    }
    return res;   
    }
}