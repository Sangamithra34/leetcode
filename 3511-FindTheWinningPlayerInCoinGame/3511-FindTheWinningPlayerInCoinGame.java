// Last updated: 1/26/2026, 4:32:02 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int win = Math.min(x,y/4);
        if(win%2==0){
            return "Bob";
        }
        else{
            return "Alice";
        }
    }
}