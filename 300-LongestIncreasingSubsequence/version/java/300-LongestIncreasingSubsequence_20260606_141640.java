// Last updated: 6/6/2026, 2:16:40 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        if (n <= 1)
5            return n;
6        int arr[] = new int[n];
7        arr[n - 1] = 1;
8        int max = 1;
9        for (int i = n - 2; i >= 0; i--) {
10            int ans = 0;
11            for (int j = i + 1; j < n; j++) {
12                if (nums[i] < nums[j]) {
13                    ans = Math.max(ans, arr[j]);
14                }
15            }
16            arr[i] = ans + 1;
17            max = Math.max(max, arr[i]);
18        }
19        return max;
20    }
21}