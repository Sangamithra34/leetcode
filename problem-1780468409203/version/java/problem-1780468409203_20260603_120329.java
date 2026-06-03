// Last updated: 6/3/2026, 12:03:29 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int start = 0;
5        int end = n-1;
6        while(start<=end){
7            int mid = (start+end)/2;
8            if(nums[mid]==target) return mid;
9            if(nums[mid]<target) start = mid+1;
10            if(nums[mid]>target) end = mid-1;
11        }
12    return -1;
13    }
14}