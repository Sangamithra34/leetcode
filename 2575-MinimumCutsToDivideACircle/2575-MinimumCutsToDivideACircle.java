// Last updated: 1/26/2026, 4:32:22 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return n/2;
        }
        else{
            return n;
        }
    }
}