// Last updated: 1/26/2026, 4:33:34 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;       
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];           
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }       
        return maxSum;
    }
}