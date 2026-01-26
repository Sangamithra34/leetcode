// Last updated: 1/26/2026, 4:33:15 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int new_sum=0;
        for(int i=0;i<nums.length;i++){
            new_sum+=nums[i];
        }
        return sum - new_sum;
    }
}