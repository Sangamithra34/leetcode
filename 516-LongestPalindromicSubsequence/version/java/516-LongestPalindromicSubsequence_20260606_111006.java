// Last updated: 6/6/2026, 11:10:06 AM
1class Solution {
2    public int recursion(String text1,String text2,int x,int y,HashMap<String,Integer>map){
3        if(x == text1.length() || y == text2.length()) return 0;
4        String t=x+","+y;
5        int ans;
6        if(map.containsKey(t)) return map.get(t);
7        if(text1.charAt(x)==text2.charAt(y)){
8            ans= 1+recursion(text1,text2,x+1,y+1,map);
9        }else{  
10             ans= Math.max(recursion(text1,text2,x+1,y,map),recursion(text1,text2,x,y+1,map));
11        }
12        map.put(t,ans);
13        return ans;
14    }
15    public int longestCommonSubsequence(String text1, String text2) {
16        HashMap<String,Integer>map=new HashMap<>();
17        return recursion(text1,text2,0,0,map);  
18    }
19}