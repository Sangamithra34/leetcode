// Last updated: 1/26/2026, 4:32:55 PM
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int t = b;
            b = a + b;
            a = t;
        }
        return b; 
    }
}