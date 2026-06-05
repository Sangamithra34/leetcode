// Last updated: 6/5/2026, 2:49:44 PM
1import java.util.Arrays;
2
3class Solution {
4    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
5        int n = startTime.length;
6        int[][] jobs = new int[n][3];
7        for (int i = 0; i < n; i++) {
8            jobs[i][0] = startTime[i];
9            jobs[i][1] = endTime[i];
10            jobs[i][2] = profit[i];
11        }
12        Arrays.sort(jobs, (a, b) -> a[1] - b[1]); // sort by end time
13        int[] dp = new int[n];
14        dp[0] = jobs[0][2];
15        for (int i = 1; i < n; i++) {
16            int take = jobs[i][2];
17            for (int j = i - 1; j >= 0; j--) {
18                if (jobs[j][1] <= jobs[i][0]) {
19                    take += dp[j];
20                    break;
21                }
22            }
23            int skip = dp[i - 1];
24            if (take > skip) {
25                dp[i] = take;
26            } else {
27                dp[i] = skip;
28            }
29        }
30        return dp[n - 1];
31    }
32}