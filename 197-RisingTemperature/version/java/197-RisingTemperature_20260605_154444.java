// Last updated: 6/5/2026, 3:44:44 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return nums[0];
5        if (n == 2) return Math.max(nums[0], nums[1]);
6
7        int k = 0, t = 0, ans = 0;
8        for (int i = 0; i < n - 1; i++) {
9            ans = Math.max(k, t + nums[i]);
10            t = k;
11            k = ans;
12        }
13        int case1 = ans;
14
15        k = 0; t = 0; ans = 0;
16        for (int i = 1; i < n; i++) {
17            ans = Math.max(k, t + nums[i]);
18            t = k;
19            k = ans;
20        }
21        int case2 = ans;
22
23        return Math.max(case1, case2);
24    }
25}
26