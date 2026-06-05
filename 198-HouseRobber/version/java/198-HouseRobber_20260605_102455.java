// Last updated: 6/5/2026, 10:24:55 AM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int k = 0;
5        int t = 0;
6        int ans = 0;
7        for(int i : nums){
8            ans = Math.max(k,t+i);
9            t = k;
10            k = ans;
11        }
12        return ans;
13    }
14}