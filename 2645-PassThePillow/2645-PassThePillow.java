// Last updated: 1/26/2026, 4:32:17 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = time / (n - 1);
        int rem = time % (n-1);
        if(cycle%2==0) return rem+1;
        else return n-rem;
    }
}