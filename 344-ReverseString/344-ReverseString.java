// Last updated: 6/6/2026, 11:11:27 AM
class Solution{
    public void reverseString(char[] s){
        int n = s.length;
        int left=0,right=n-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }
}