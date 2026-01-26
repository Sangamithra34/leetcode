// Last updated: 1/26/2026, 4:33:21 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
         return n > 0 && (n & (n - 1)) == 0;    
    }
}