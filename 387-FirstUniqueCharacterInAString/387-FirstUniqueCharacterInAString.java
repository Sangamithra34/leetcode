// Last updated: 1/26/2026, 4:33:11 PM
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.lastIndexOf(c) && i == s.indexOf(c)) return i;
        }
        return -1;        
    }
}