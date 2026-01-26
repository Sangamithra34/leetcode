// Last updated: 1/26/2026, 4:32:23 PM
class Solution {
    public int pivotInteger(int n) {
        int m = n*(n+1)/2;
        int x = (int) Math.sqrt(m);
        return x*x ==m ? x : -1;
    }
}