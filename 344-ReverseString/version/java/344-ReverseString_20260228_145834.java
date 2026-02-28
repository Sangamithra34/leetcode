// Last updated: 2/28/2026, 2:58:34 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3        int i = 0;
4        int j = s.length() - 1;
5        while(i < j) {
6            if(s.charAt(i) != s.charAt(j)) {
7                return isPalli(s,i + 1,j) || isPalli(s,i,j - 1);
8            }
9            i++;
10            j--;
11        }
12        return true;
13    }
14    public boolean isPalli(String s,int i,int j) {
15        while(i < j) {
16            if(s.charAt(i) != s.charAt(j)) {
17                return false;
18            }
19            i++;
20            j--;
21        }
22        return true;
23    }
24}