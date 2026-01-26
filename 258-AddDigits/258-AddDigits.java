// Last updated: 1/26/2026, 4:33:18 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return num;
     return (num-1)%9+1;
    }
}