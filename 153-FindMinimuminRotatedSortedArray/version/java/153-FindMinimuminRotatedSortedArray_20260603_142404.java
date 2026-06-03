// Last updated: 6/3/2026, 2:24:04 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int start = 0;
5        int end = n-1;
6        while(start<end){
7            int mid = (start+end)/2;
8            if(nums[mid] < nums[end]){
9                end = mid;
10            }
11            else{
12                start = mid+1;
13            }
14        }
15        return nums[start];
16    }
17}