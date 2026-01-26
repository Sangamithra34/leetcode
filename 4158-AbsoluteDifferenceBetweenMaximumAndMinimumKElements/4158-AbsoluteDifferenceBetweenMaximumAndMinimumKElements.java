// Last updated: 1/26/2026, 4:31:54 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int largest=0;
        int smallest=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            smallest+=nums[i];
        }
        for(int i=n-k;i<n;i++){
            largest+=nums[i];
        }
        return largest-smallest;
        
    }
}