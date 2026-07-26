// Last updated: 7/26/2026, 8:27:35 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n) return -1;
4        int result=0;
5        for(int i=0;i<n;i++){
6            int c=Math.min(9,s);
7            result=result*10+c;
8            s-=c;
9        }
10        return result;
11    }
12}