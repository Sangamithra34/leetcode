// Last updated: 2/28/2026, 6:56:19 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4        for (int i = n-1; i >= 0; i--) {
5            digits[i]++;            
6            if (digits[i] < 10) {
7                return digits;
8            }           
9            digits[i] = 0;
10        }        
11        int[] res = new int[n+1];
12        res[0] = 1;
13        return res;
14    }
15}