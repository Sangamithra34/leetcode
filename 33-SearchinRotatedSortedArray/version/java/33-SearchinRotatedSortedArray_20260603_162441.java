// Last updated: 6/3/2026, 4:24:41 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int start = 0;
5        int end = n-1;
6        while(start<=end){
7            int mid = (start+end)/2;
8            if(nums[mid] == target) return mid;
9            if(nums[start] <= nums[mid]){
10                if(target >= nums[start] && target < nums[mid]) end = mid-1;
11                else start = mid+1;
12            }
13            else{
14                if(target > nums[mid] && target <= nums[end]) start = mid+1;
15                else end = mid-1;
16            }
17        }
18        return -1;
19    }
20}