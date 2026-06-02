// Last updated: 6/2/2026, 4:25:40 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int res[] = new int[nums.length-k+1];
4        int a = 0;
5        Deque<Integer> dq = new ArrayDeque<>();
6        for(int i=0;i<nums.length;i++){
7            if(!dq.isEmpty() && dq.peekFirst()< i-k+1) dq.pollFirst();
8            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
9                dq.pollLast();
10            }
11            dq.offerLast(i);
12            if(i>= k-1){
13                res[a++] = nums[dq.peekFirst()];
14            }
15        }
16        return res;
17    }
18}