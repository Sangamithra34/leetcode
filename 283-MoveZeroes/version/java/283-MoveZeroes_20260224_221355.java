// Last updated: 2/24/2026, 10:13:55 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        if (nums.length == 1) {
4            return;
5        }
6        int nonZeroIndex = 0;
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] != 0) {
9                nums[nonZeroIndex] = nums[i];
10                nonZeroIndex++;
11            }
12        }
13        while(nonZeroIndex<nums.length){
14            nums[nonZeroIndex] = 0;
15            nonZeroIndex++;
16        }
17    }
18}