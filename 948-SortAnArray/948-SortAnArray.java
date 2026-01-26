// Last updated: 1/26/2026, 4:32:56 PM
class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Shift elements of nums[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Place key at its correct position
            nums[j + 1] = key;
        }

        return nums;
    }
}