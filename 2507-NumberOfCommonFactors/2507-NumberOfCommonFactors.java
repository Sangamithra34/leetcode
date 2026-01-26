// Last updated: 1/26/2026, 4:32:28 PM
class Solution {
    public int commonFactors(int a, int b) {
        int s=Math.min(a,b);
        int count = 0;
        for(int i=1;i<=s;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}