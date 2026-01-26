// Last updated: 1/26/2026, 4:32:00 PM
class Solution {
    public int rev(int n){
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        int rev = rev(n);
        int ans = Math.abs(n - rev);
        return ans;
    }
}