// Last updated: 1/26/2026, 4:32:34 PM
class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==3) return true;
        else return false;

    }
}