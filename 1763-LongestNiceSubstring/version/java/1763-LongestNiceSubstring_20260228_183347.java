// Last updated: 2/28/2026, 6:33:47 PM
1class Solution {
2    public String longestNiceSubstring(String s) {
3        int len = s.length();
4        if (len < 2) {
5            return "";
6        }
7        for (int i = 0; i < len; i++) {
8            char ch = s.charAt(i);
9            if (s.indexOf(Character.toLowerCase(ch)) == -1 || s.indexOf(Character.toUpperCase(ch)) == -1) {
10                String left = longestNiceSubstring(s.substring(0, i));
11                String right = longestNiceSubstring(s.substring(i + 1));
12                return left.length() >= right.length() ? left : right;
13            }
14        }
15        return s;
16    }
17}