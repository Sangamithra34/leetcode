// Last updated: 6/6/2026, 11:11:16 AM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int arr[] = new int[10001];
        // for(int i=0;i<nums.length;i++){
        //     arr[nums[i]] += nums[i];
        // }
        for(int val : nums){
            arr[val] += val;
        }
        int a=0,b=0,m=0;
        for(int i : arr){
            m = Math.max(a,b+i);
            b = a;
            a = m;
        }
        return m;
    }
}