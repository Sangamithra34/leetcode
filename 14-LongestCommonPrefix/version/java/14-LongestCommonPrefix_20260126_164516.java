// Last updated: 1/26/2026, 4:45:16 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s = "";
5        int i = 0;
6        int l = strs.length;
7        while (i < strs[0].length()) {
8            if (strs[0].charAt(i) == strs[l - 1].charAt(i))
9                s += strs[0].charAt(i);
10            else
11                break;
12            i++;
13        }
14        return s;
15    }
16}