// Last updated: 1/26/2026, 4:32:38 PM
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}