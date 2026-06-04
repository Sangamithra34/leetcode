// Last updated: 6/4/2026, 12:03:50 PM
1import java.util.*;
2
3class Solution {
4    public int eraseOverlapIntervals(int[][] intervals) {
5        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
6        int count = 0; 
7        int prevEnd = intervals[0][1]; 
8        for (int i = 1; i < intervals.length; i++) {
9            if (intervals[i][0] < prevEnd) {
10                count++;
11            } else {
12                prevEnd = intervals[i][1];
13            }
14        }
15        return count;
16    }
17}
18