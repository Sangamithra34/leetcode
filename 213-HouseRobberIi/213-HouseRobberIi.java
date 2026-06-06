// Last updated: 6/6/2026, 11:11:35 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int case1 = robRange(nums, 0, n - 2);

        int case2 = robRange(nums, 1, n - 1);

        return Math.max(case1, case2);
    }
    private int robRange(int[] nums, int start, int end) {
        int k = 0, t = 0, ans = 0;
        for (int i = start; i <= end; i++) {
            ans = Math.max(k, t + nums[i]);
            t = k;
            k = ans;
        }
        return ans;
    }
}
