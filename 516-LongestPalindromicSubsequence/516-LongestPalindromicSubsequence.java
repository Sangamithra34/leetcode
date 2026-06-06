// Last updated: 6/6/2026, 11:11:20 AM
class Solution {
    public int longestInteger(String s,int left,int right,HashMap<String,Integer> map){
        if(left > right) return 0;
        if(left == right) return 1;
        String t = left+" , "+right;
        if(map.containsKey(t)) return map.get(t);
        int ans;
        if(s.charAt(left) == s.charAt(right))
            ans = 2 + longestInteger(s,left+1,right-1,map);
        else
            ans = Math.max(longestInteger(s,left+1,right,map),longestInteger(s,left,right - 1,map));
        map.put(t,ans);
        return ans;
    }
    public int longestPalindromeSubseq(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        return longestInteger(s,0,s.length()-1,map);
    }
}