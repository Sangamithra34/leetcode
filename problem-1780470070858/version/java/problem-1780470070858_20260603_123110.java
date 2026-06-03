// Last updated: 6/3/2026, 12:31:10 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row = matrix.length;
4        int col = matrix[0].length;
5        int start = 0;
6        int end = (row * col)-1;
7        while(start<=end){
8            int mid = (start+end)/2;
9            int val = matrix[mid/col][mid%col];
10            if(val==target) return true;
11            if(val<target) start = mid+1;
12            else end = mid-1;
13        }
14        return false;
15    }
16}