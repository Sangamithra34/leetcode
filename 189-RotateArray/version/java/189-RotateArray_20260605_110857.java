// Last updated: 6/5/2026, 11:08:57 AM
1import java.util.*;
2
3class Solution {
4    public void rotate(int[] nums, int k) {
5        int n = nums.length;
6        k %= n;
7        reverse(nums, 0, n - 1);
8        reverse(nums, 0, k - 1);
9        reverse(nums, k, n - 1);
10    }
11
12    private void reverse(int[] nums, int start, int end) {
13        while (start < end) {
14            int temp = nums[start];
15            nums[start] = nums[end];
16            nums[end] = temp;
17            start++;
18            end--;
19        }
20    }
21}