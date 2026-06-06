// Last updated: 6/6/2026, 9:59:36 AM
1class Solution {
2    public int longestInteger(String s,int left,int right,HashMap<String,Integer> map){
3        if(left > right) return 0;
4        if(left == right) return 1;
5        String t = left+" , "+right;
6        if(map.containsKey(t)) return map.get(t);
7        int ans;
8        if(s.charAt(left) == s.charAt(right))
9            ans = 2 + longestInteger(s,left+1,right-1,map);
10        else
11            ans = Math.max(longestInteger(s,left+1,right,map),longestInteger(s,left,right - 1,map));
12        map.put(t,ans);
13        return ans;
14    }
15    public int longestPalindromeSubseq(String s) {
16        HashMap<String,Integer> map = new HashMap<>();
17        return longestInteger(s,0,s.length()-1,map);
18    }
19}