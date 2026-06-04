// Last updated: 6/4/2026, 3:52:09 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n == 0 || n == 1) {
4            return n;
5        }
6        int a = 1, b = 1;
7        for (int i = 2; i <= n; i++) {
8            int temp = b;
9            b = a + b;
10            a = temp;
11        }
12        return b;
13        //return climbStairs(n-1) + climbStairs(n-2);
14    }
15}