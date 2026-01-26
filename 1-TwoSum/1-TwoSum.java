// Last updated: 1/26/2026, 4:33:39 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = target - nums[i];
            if (numMap.containsKey(x)) {
                return new int[]{i,numMap.get(x)};
            }
            else{
                numMap.put(nums[i], i);                
            }
        }
        return new int[]{};
    }
}