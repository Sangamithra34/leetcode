// Last updated: 6/6/2026, 11:11:07 AM
class Solution {
    public int recursion(String text1,String text2,int x,int y,HashMap<String,Integer>map){
        if(x == text1.length() || y == text2.length()) return 0;
        String t=x+","+y;
        int ans;
        if(map.containsKey(t)) return map.get(t);
        if(text1.charAt(x)==text2.charAt(y)){
            ans= 1+recursion(text1,text2,x+1,y+1,map);
        }else{  
             ans= Math.max(recursion(text1,text2,x+1,y,map),recursion(text1,text2,x,y+1,map));
        }
        map.put(t,ans);
        return ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<String,Integer>map=new HashMap<>();
        return recursion(text1,text2,0,0,map);  
    }
}