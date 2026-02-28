// Last updated: 2/28/2026, 6:39:51 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int a = 1;
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]!=nums[i-1]){
6                nums[a]=nums[i];
7                a++;
8            }
9        }
10        return a;
11    }
12}