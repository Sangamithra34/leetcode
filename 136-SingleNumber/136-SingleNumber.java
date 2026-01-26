// Last updated: 1/26/2026, 4:33:30 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums){
            res^=n;
        }
        return res;
    }
}