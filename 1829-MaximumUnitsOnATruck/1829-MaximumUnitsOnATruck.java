// Last updated: 6/6/2026, 11:11:06 AM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]);
        int n = boxTypes.length;
        int k = 0;
        for(int[] box : boxTypes){
            int B = box[0];
            int U = box[1];
            int T = Math.min(B,truckSize);
            k += T * U;
            truckSize -= T;
            if(truckSize == 0){
                break;
            }

        }
        return k;
    }
}