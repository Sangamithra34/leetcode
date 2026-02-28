// Last updated: 2/28/2026, 6:45:12 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int n = nums.length;
4        if(n==0){
5            return 0;
6        }
7        int a = 0;
8        for(int i=0;i<n;i++){
9            if(nums[i]!=val){
10                nums[a++]=nums[i];
11            }
12        }
13        return a;
14    }
15}