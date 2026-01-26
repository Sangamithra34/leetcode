// Last updated: 1/26/2026, 4:33:23 PM
class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            if((n&1)==1){
                res++;
            }
            n>>=1;
        }
        return res;       
    }
}