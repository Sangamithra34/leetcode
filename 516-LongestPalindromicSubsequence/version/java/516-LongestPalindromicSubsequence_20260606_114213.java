// Last updated: 6/6/2026, 11:42:13 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n1 = text1.length();
4        int n2 = text2.length();
5        int[][] arr = new int[n1 + 1][n2 + 1];
6        for (int i = 1; i <= n1; i++) {
7            for (int j = 1; j <= n2; j++) {
8                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
9                    arr[i][j] = 1 + arr[i - 1][j - 1];
10                } else {
11                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
12                }
13            }
14        }
15        return arr[n1][n2];
16    }
17}