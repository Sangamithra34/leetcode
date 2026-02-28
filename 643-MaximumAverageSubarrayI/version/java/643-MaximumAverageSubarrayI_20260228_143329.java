// Last updated: 2/28/2026, 2:33:29 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double sum = 0 ; 
4        for(int i = 0 ; i<k ; i++){
5            sum += nums[i];
6        }
7        double result = sum;
8        for(int i = k ; i<nums.length ; i++){
9            sum += nums[i] - nums[i-k];
10            result = Math.max(result , sum);
11        }
12        return result/k;
13    }
14}