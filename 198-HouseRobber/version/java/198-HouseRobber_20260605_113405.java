// Last updated: 6/5/2026, 11:34:05 AM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        int arr[] = new int[10001];
4        // for(int i=0;i<nums.length;i++){
5        //     arr[nums[i]] += nums[i];
6        // }
7        for(int val : nums){
8            arr[val] += val;
9        }
10        int a=0,b=0,m=0;
11        for(int i : arr){
12            m = Math.max(a,b+i);
13            b = a;
14            a = m;
15        }
16        return m;
17    }
18}