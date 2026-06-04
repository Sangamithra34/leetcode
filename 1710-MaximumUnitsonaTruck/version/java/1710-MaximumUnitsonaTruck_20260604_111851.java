// Last updated: 6/4/2026, 11:18:51 AM
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]);
4        int n = boxTypes.length;
5        int totalUnits = 0;
6        for(int[] box : boxTypes){
7            int B = box[0];
8            int U = box[1];
9            int T = Math.min(B,truckSize);
10            totalUnits += T * U;
11            truckSize -= T;
12            if(truckSize == 0){
13                break;
14            }
15
16        }
17        return totalUnits;
18    }
19}