// Last updated: 6/4/2026, 3:43:47 PM
1class Solution {
2    public int fib(int n) {
3        // if (n <= 1) return n;
4        // int a = 0, b = 1;
5        // for (int i = 2; i <= n; i++) {
6        //     int t = b;
7        //     b = a + b;
8        //     a = t;
9        // }
10        // return b;
11        if(n<=1) return n;
12        return fib(n-1)+fib(n-2); 
13    }
14}