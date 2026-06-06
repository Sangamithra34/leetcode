// Last updated: 6/6/2026, 11:11:37 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int k = 0;
        int t = 0;
        int ans = 0;
        for(int i : nums){
            ans = Math.max(k,t+i);
            t = k;
            k = ans;
        }
        return ans;
    }
}