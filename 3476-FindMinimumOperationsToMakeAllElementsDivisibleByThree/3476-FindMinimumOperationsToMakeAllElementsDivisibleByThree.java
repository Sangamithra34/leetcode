// Last updated: 1/26/2026, 4:32:03 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int n=0;
        for(int i:nums){
            if(i%3!=0){
                n++;
            }
        }
        return n;
    }
}