// Last updated: 2/28/2026, 6:49:08 PM
1class Solution {
2   public int searchInsert(int[] nums, int target) {
3        int l = 0 ;
4        int r = nums.length-1;
5        while (l<=r){
6            int mid  = l + (r-l)/2;
7            if (nums[mid] == target) {
8                return mid;
9            }
10            if (nums[mid] < target) {
11                l = mid + 1;
12            } else {
13                r = mid - 1;
14            }
15        }
16        return l;
17    }
18}