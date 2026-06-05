// Last updated: 6/5/2026, 10:23:58 AM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int k = 0;
5        int t = 0;
6        int ans = 0;
7        for(int i=0;i<n;i++){
8            ans = Math.max(k,t+nums[i]);
9            t = k;
10            k = ans;
11        }
12        return ans;
13    }
14}