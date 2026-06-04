// Last updated: 6/4/2026, 12:05:01 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
4        int count = 0; 
5        int k = intervals[0][1]; 
6        for (int i = 1; i < intervals.length; i++) {
7            if (intervals[i][0] < k) {
8                count++;
9            } else {
10                k = intervals[i][1];
11            }
12        }
13        return count;
14    }
15}
16