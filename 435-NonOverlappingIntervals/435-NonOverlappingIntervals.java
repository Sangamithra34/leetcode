// Last updated: 6/6/2026, 11:11:24 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0; 
        int k = intervals[0][1]; 
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < k) {
                count++;
            } else {
                k = intervals[i][1];
            }
        }
        return count;
    }
}
