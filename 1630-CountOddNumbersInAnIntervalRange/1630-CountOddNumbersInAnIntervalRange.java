// Last updated: 1/26/2026, 4:32:45 PM
class Solution {
    public int countOdds(int low, int high) {
        int nums=high-low+1;  
		if(low%2!=0 && high%2!=0)  
            return nums/2 + 1;
        else
		    return nums/2;
    }
}