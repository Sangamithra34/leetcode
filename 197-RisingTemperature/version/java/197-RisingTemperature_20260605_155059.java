// Last updated: 6/5/2026, 3:50:59 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return nums[0];
5        if (n == 2) return Math.max(nums[0], nums[1]);
6
7        int case1 = robRange(nums, 0, n - 2);
8
9        int case2 = robRange(nums, 1, n - 1);
10
11        return Math.max(case1, case2);
12    }
13    private int robRange(int[] nums, int start, int end) {
14        int k = 0, t = 0, ans = 0;
15        for (int i = start; i <= end; i++) {
16            ans = Math.max(k, t + nums[i]);
17            t = k;
18            k = ans;
19        }
20        return ans;
21    }
22}
23