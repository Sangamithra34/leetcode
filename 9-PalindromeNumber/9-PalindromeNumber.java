// Last updated: 1/26/2026, 4:33:36 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int xcopy = x;
        if(x<0){
            return false;
        }
        while(x>0){
            rev = (rev*10) + (x%10);
            x/=10;
        }
        return rev == xcopy;
    }
}